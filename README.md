# API RESTful de uma Pizzaria

Este projeto consiste em uma API RESTful para uma pizzaria, fornecendo rotas CRUD (Create, Read, Update, Delete) para Pizzas, Clientes, Ingredientes e Bebidas.

## Arquitetura e Tecnologias Utilizadas

A API segue a arquitetura MVC (Model-View-Controller) e utiliza as seguintes dependências do Spring Framework:

- **Spring Web**: Para desenvolvimento de aplicativos da web, incluindo a exposição de endpoints REST.
- **Spring Data JPA**: Para persistência de dados com o banco de dados relacional.
- **Driver MySQL**: Para integração com o banco de dados MySQL.
- **Thymeleaf**: Um mecanismo de template para renderização de views no lado do servidor.
- **Dev Tools**: Para facilitar o desenvolvimento com reload automático e outras ferramentas úteis.

## Requisitos

Certifique-se de ter as seguintes ferramentas instaladas localmente:

- Java Development Kit (JDK) 8 ou superior
- Maven
- MySQL Server

## Configuração do Banco de Dados

1. Crie um banco de dados MySQL chamado `pizzaria_db`.
2. Configure as credenciais de acesso ao banco de dados no arquivo `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/pizzaria_db
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   
## Executando a Aplicação
Clone o repositório para sua máquina local:
bash
Copy code
git clone https://github.com/seu_usuario/pizzaria-api.git

A API estará disponível em http://localhost:8080.
