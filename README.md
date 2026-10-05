# Business API Integration Starter

A production-minded starter template for building secure business API integrations with **React + TypeScript**, **Spring Boot**, and **PostgreSQL**.

## What this project demonstrates

- Layered Spring Boot REST API
- Request validation and consistent JSON errors
- PostgreSQL persistence with Spring Data JPA
- OpenAPI/Swagger documentation
- React + TypeScript client
- Docker Compose for local development
- Environment-based configuration
- Backend and frontend tests
- GitHub Actions CI

The example domain is a small **business integration** resource. It is intentionally generic so the project can be adapted to CRM, ERP, SaaS, automation, or third-party API workflows.

## Architecture

```text
React + TypeScript
        |
        | HTTP/JSON
        v
Spring Boot REST API
  Controller -> Service -> Repository
        |
        v
   PostgreSQL
```

See [docs/architecture.md](docs/architecture.md) for details.

## Requirements

- Java 21
- Maven 3.9+ (or use the included Maven wrapper when generated locally)
- Node.js 20+
- Docker and Docker Compose (optional, recommended for PostgreSQL)

## Configuration

Copy `.env.example` to `.env` for local Docker usage. Never commit real secrets.

The backend reads these environment variables:

| Variable | Default | Purpose |
|---|---|---|
| `DB_URL` | `jdbc:postgresql://localhost:5432/business_integration` | JDBC URL |
| `DB_USERNAME` | `app` | Database user |
| `DB_PASSWORD` | `app` | Local development password only |
| `SERVER_PORT` | `8080` | API port |

## Run with Docker Compose

```bash
docker compose up --build
```

API: http://localhost:8080  
Swagger UI: http://localhost:8080/swagger-ui/index.html  
Frontend: http://localhost:5173

Stop services:

```bash
docker compose down
```

## Run backend locally

Start PostgreSQL with Docker, then:

```bash
cd backend
mvn spring-boot:run
```

Run tests:

```bash
mvn test
```

## Run frontend locally

```bash
cd frontend
npm ci
npm run dev
```

Run tests:

```bash
npm test -- --run
```

## API

`GET /api/v1/integrations` lists integrations.

`POST /api/v1/integrations` creates an integration. Example:

```json
{
  "name": "CRM Sync",
  "provider": "example-crm",
  "endpointUrl": "https://api.example.com/v1"
}
```

See [docs/api.md](docs/api.md) and the generated OpenAPI UI for the complete contract.

## Security considerations

This starter deliberately contains no real credentials. For production deployments, use a secret manager, TLS, least-privilege database credentials, authentication/authorization, rate limiting, audit logging, dependency scanning, and provider-specific credential rotation. See [SECURITY.md](SECURITY.md).

## Deployment

See [docs/deployment.md](docs/deployment.md) for a deployment checklist and container guidance.

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md).

## License

MIT. See [LICENSE](LICENSE).

## About Attendly Solutions

Attendly Solutions builds custom software, SaaS products, AI applications, and business automation solutions for modern businesses.

https://www.attendly.solutions/
