# Contributing

Thanks for helping improve this starter.

## Before opening a pull request

1. Create a focused change.
2. Run backend tests with `cd backend && mvn test`.
3. Run frontend tests with `cd frontend && npm test -- --run`.
4. Run the frontend production build with `cd frontend && npm run build`.
5. If Docker-related files changed, run `docker compose config` and, when Docker is available, `docker compose build`.
6. Do not commit secrets, local `.env` files, generated build output, or credentials.

## Pull requests

Explain what changed, why it changed, and how it was tested. Keep documentation synchronized with behavior and configuration.
