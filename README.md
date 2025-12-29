# My First Web API – Spring Boot

Este projeto é uma API REST criada para demonstrar, de forma simples e prática, como construir uma aplicação segura usando Spring Boot.  
Ela implementa autenticação básica, controle de acesso por papéis (roles), persistência de dados com JPA e um banco de dados em memória (H2).  
O objetivo é servir como base de estudo para quem está começando com APIs Java modernas, mostrando como estruturar o código, proteger rotas e manipular dados de usuários.

## Tecnologias
- Java 21
- Spring Boot 3
- Spring Web
- Spring Security (Basic Auth)
- Spring Data JPA
- H2 Database

## Credenciais dos usuários
Criados automaticamente ao iniciar o projeto.

### ADMIN (acesso total)
- username: admin
- password: master123
- role: MANAGERS

### USER (acesso limitado)
- username: user
- password: user123
- role: USERS

## O que a API faz
- Permite listar usuários cadastrados
- Permite buscar um usuário pelo username
- Permite criar, atualizar e excluir usuários (somente MANAGERS)
- Protege rotas com autenticação e autorização
- Armazena dados no banco H2 usando JPA
- Inicializa o banco com dois usuários padrão

## Endpoints principais

### Listar usuários
GET /users

### Buscar usuário por username
GET /users/{username}

### Criar usuário
POST /users  
Acesso: MANAGERS

### Atualizar usuário
PUT /users/{id}  
Acesso: MANAGERS

### Excluir usuário
DELETE /users/{id}  
Acesso: MANAGERS

## Acessar o H2
URL: http://localhost:8080/h2-console

Configuração:
- JDBC URL: jdbc:h2:~/test
- User: sa
- Password: (vazio)
