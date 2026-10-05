# API guide

Base URL: `http://localhost:8080`

OpenAPI UI: `http://localhost:8080/swagger-ui/index.html`

## List integrations

`GET /api/v1/integrations`

Returns an array of configured business integrations.

## Create an integration

`POST /api/v1/integrations`

Request:

```json
{
  "name": "CRM Sync",
  "provider": "example-crm",
  "endpointUrl": "https://api.example.com/v1"
}
```

Successful response: `201 Created`.

## Validation errors

Invalid requests return `400 Bad Request` with a JSON body containing the timestamp, HTTP status, error, message, and request path.

## OpenAPI

The application exposes the generated OpenAPI specification at `/v3/api-docs` and Swagger UI at `/swagger-ui/index.html`.
