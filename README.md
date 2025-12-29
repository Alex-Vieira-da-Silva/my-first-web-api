# My First Web API – Spring Boot

API REST simples usando Spring Boot, Spring Security, JPA e banco H2.

## Tecnologias
- Java 21
- Spring Boot 3
- Spring Web
- Spring Security (Basic Auth)
- Spring Data JPA
- H2 Database

## Credenciais dos usuários
Criados automaticamente ao iniciar o projeto.

### ADMIN
- username: admin
- password: master123
- role: MANAGERS

### USER
- username: user
- password: user123
- role: USERS

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

## Como executar
Via Maven:
