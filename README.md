# API Auth Usuários
![GitHub repo size](https://img.shields.io/github/repo-size/samuelmsilva2v/apiAuthUsuarios?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/samuelmsilva2v/apiAuthUsuarios?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/samuelmsilva2v/apiAuthUsuarios?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/samuelmsilva2v/apiAuthUsuarios?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/samuelmsilva2v/apiAuthUsuarios?style=for-the-badge)

[🇺🇸 Read in English](#supermarket-web)

🖥️ API RESTful desenvolvida em Spring Boot para criação e autenticação de usuários através de e-mail e senha.

### Tecnologias utilizadas:
- Spring Boot
- JPA / Hibernate
- Maven
- PostgreSQL
- JWT
- Swagger (para documentação)
- Postman (para testes dos endpoints)

## Endpoints 
| Método | Endpoint             | Descrição                   |
|--------|-----------------------|-----------------------------|
| POST   | `/api/usuarios/criar`      | Cadastrar um novo usuário      |
| POST    | `/api/usuarios/autenticar`      | Autenticar usuário   |

```json
{
  "nome": "string",
  "email": "string",
  "senha": "nMgNLgCojs!y?3l@oZUsRT9w2ew7cPMQJQxmXLspdpH&xMBu%wR!Drz?rSeOzhVRlTkXzaZkw$9CY"
}
```

## Configuração e Execução

### 1. Clone o repositório:

```bash
https://github.com/samuelmsilva2v/apiAuthUsuarios.git
cd apiAuthUsuarios
```

### 2. Instale as dependências:

```bash
mvn clean install
```

### 3. Execute o projeto:
```bash
mvn spring-boot:run
```

### 4. Acesse a aplicação:
- Documentação da API: http://localhost:8081/swagger-ui/index.html

---

# Auth Users API
[🇧🇷 Leia em Português](#api-auth-usuários)

🖥️ RESTful API developed in Spring Boot for user creation and authentication via email and password.

### Technologies used:
- Spring Boot
- JPA / Hibernate
- Maven
- PostgreSQL
- JWT
- Swagger (for documentation)
- Postman (for endpoints testing)

## Endpoints 
| Method | Endpoint                  | Description               |
|--------|---------------------------|---------------------------|
| POST   | `/api/usuarios/criar`     | Cadastrar um novo usuário |
| POST   | `/api/usuarios/autenticar`| Autenticar usuário        |

## Configuration and Execution:

### 1. Clone the repository:
```bash
https://github.com/samuelmsilva2v/apiAuthUsuarios.git
cd apiAuthUsuarios
```

### 2. Install the dependencies:
```bash
mvn clean install
```

### 3. Run the project:
```bash
mvn spring-boot:run
```

### 4. Access the application:
- API Documentation: http://localhost:8081/swagger-ui/index.html
