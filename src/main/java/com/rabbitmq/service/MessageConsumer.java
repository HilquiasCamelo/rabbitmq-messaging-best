package com.rabbitmq.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.IOException;

@Service
@Log4j2
public class MessageConsumer {

    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    public MessageConsumer(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @RabbitListener(queues = "nome_da_fila")
    public void receiveMessage(String message) throws IOException {
        try {
            // Processar a mensagem recebida
            log.info("Mensagem recebida do RabbitMQ: {}", message);

            // Gerar uma chave única para cada mensagem (por exemplo, usando um UUID)
            String chave = java.util.UUID.randomUUID().toString();

            // Salvar a mensagem no Redis com a chave gerada
            redisTemplate.opsForValue().set(chave, message);

            // Confirmando o processamento bem-sucedido da mensagem
            log.info("Mensagem processada com sucesso!");

        } catch (Exception e) {
            log.error("Erro ao processar mensagem do RabbitMQ: {}", e.getMessage());
            // Tratar o erro adequadamente
        }
    }
}
