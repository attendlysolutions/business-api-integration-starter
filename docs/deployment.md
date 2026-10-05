# Deployment guide

This repository is a development starter, not a production deployment blueprint.

## Container deployment

Build and run the stack with:

```bash
docker compose up --build
```

For production, replace demo database credentials with a secret manager or deployment-platform secrets. Do not commit a production `.env` file.

## Production checklist

- Use TLS for all external traffic.
- Add authentication and authorization before exposing the API publicly.
- Use least-privilege PostgreSQL credentials.
- Disable or restrict public Swagger UI if appropriate for your environment.
- Add database migrations instead of relying on `ddl-auto: update`.
- Configure structured logging, metrics, health checks, and alerting.
- Add rate limiting and request-size limits at the edge.
- Store provider credentials in a managed secret store.
- Pin container and dependency versions and scan images/dependencies.
- Back up PostgreSQL and test restoration.
