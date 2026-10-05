# Architecture

The starter uses a small layered architecture that is easy to extend without coupling HTTP concerns to persistence.

```text
React + TypeScript
       |
       | JSON over HTTP
       v
Spring MVC Controller
       |
       v
Service layer
       |
       v
Spring Data JPA Repository
       |
       v
PostgreSQL
```

## Backend layers

- `api/`: cross-cutting HTTP error handling.
- `integration/`: domain entity, request DTO, controller, service, and repository for business integrations.
- `config/`: application web configuration such as CORS.

## Data flow

1. The frontend calls `/api/v1/integrations`.
2. The controller validates incoming JSON with Jakarta Validation.
3. The service owns persistence operations.
4. Spring Data JPA writes to PostgreSQL.
5. Validation failures are returned as structured JSON errors.

## Extending the example

For a real provider integration, keep provider credentials outside source control and introduce a dedicated integration client/service. Store only non-secret configuration in the database. Authentication, authorization, rate limiting, audit logging, and secret rotation should be added before exposing the API to untrusted clients.
