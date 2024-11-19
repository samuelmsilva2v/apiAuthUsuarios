# API Auth Usuários
API RESTful desenvolvida em Spring Boot para criação e autenticação de usuários através de e-mail e senha.

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

### Autor
- Samuel Maciel da Silva
  - [LinkedIn](https://www.linkedin.com/in/samuelmsilva2v/)
  - [E-mail](mailto:samuelmsilva@outlook.com.br)
