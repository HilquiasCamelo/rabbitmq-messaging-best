
# RabbitMQ Messaging Best Practices

Este repositório é um guia prático que fornece as melhores práticas para o desenvolvimento de sistemas de mensageria com o RabbitMQ. Inclui exemplos, padrões de design, dicas de escalabilidade, configurações recomendadas e estratégias de tratamento de erros para garantir a robustez e a eficiência das soluções de mensagens.

## Tecnologias Utilizadas

-   Java
-   Spring Boot
-   RabbitMQ
-   Redis

## Configuração do Ambiente

### 1. Clonando o Repositório

Para começar, clone este repositório em sua máquina local usando o seguinte comando:

bash

`git clone https://github.com/HilquiasCamelo/rabbitmq-messaging-best.git`

### 2. Configuração do RabbitMQ

Certifique-se de ter o RabbitMQ instalado em seu ambiente de desenvolvimento. Você pode fazer o download e seguir as instruções de instalação no site oficial do RabbitMQ: [https://www.rabbitmq.com/](https://www.rabbitmq.com/)

### 3. Configuração do Redis

Além do RabbitMQ, este projeto utiliza o Redis para armazenar as mensagens recebidas. Certifique-se de ter o Redis instalado em seu ambiente. Você pode fazer o download e seguir as instruções de instalação no site oficial do Redis: [https://redis.io/](https://redis.io/)

### 4. Importando o Projeto

Importe o projeto em sua IDE de preferência (por exemplo, IntelliJ, Eclipse) como um projeto Maven existente.

### 5. Configuração do RabbitMQ no Spring Boot

No arquivo `application.properties` ou `application.yml`, configure as propriedades relacionadas ao RabbitMQ, como endereço do servidor, porta, nome da fila, etc.

Exemplo (`application.properties`):

properties

`spring.rabbitmq.host=localhost`
`spring.rabbitmq.port=5672`
`spring.rabbitmq.username=guest`
`spring.rabbitmq.password=guest`
`spring.rabbitmq.virtual-host=/`
`rabbitmq.queue=nome_da_fila`

### 6. Configuração do Redis no Spring Boot

No arquivo `application.properties` ou `application.yml`, configure as propriedades relacionadas ao Redis, como endereço do servidor, porta, etc.

Exemplo (`application.properties`):

properties

`spring.redis.host=localhost
spring.redis.port=6379`

## Executando o Projeto

Após a configuração do ambiente, você está pronto para executar o projeto.

### 1. Build do Projeto

Certifique-se de ter o Maven instalado em sua máquina. Acesse o diretório raiz do projeto e execute o seguinte comando para fazer o build do projeto:



`mvn clean install`

### 2. Executando o RabbitMQ Consumer

No seu IDE, localize a classe `MessageConsumer` no pacote `com.rabbitmq.service` e execute-a como uma aplicação Java. Isso iniciará o consumidor do RabbitMQ, que receberá as mensagens da fila configurada.

### 3. Executando o Spring Boot Application

No seu IDE, localize a classe principal `RabbitMQMessagingBestApplication` no pacote `com.rabbitmq` e execute-a como uma aplicação Spring Boot. Isso iniciará o servidor de aplicação e disponibilizará os endpoints REST para o envio de mensagens.

### 4. Enviando Mensagens

Com o projeto em execução, você pode enviar mensagens para o RabbitMQ usando os endpoints REST fornecidos pela aplicação. Consulte o código-fonte para ver os detalhes dos endpoints disponíveis e as estruturas de dados necessárias para o envio das mensagens.

## Contribuindo

Sinta-se à vontade para contribuir com este repositório através de pull requests. Caso tenha alguma sugestão, correção ou adição de novas práticas, será um prazer revisar suas contribuições.

## Licença

Este projeto está licenciado sob a licença [MIT](https://opensource.org/licenses/MIT). Sinta-se à vontade para utilizar, modificar e distribuir o código conforme os termos da licença.