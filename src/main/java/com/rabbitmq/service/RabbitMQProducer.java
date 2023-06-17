package com.rabbitmq.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class RabbitMQProducer {
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitMQProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message) {
        try {
            rabbitTemplate.convertAndSend("nome_da_fila", message);
            log.info("Mensagem enviada para o RabbitMQ: {}", message);
        } catch (Exception e) {
            log.error("Erro ao enviar mensagem para o RabbitMQ: {}", e.getMessage());
        }
    }
}
