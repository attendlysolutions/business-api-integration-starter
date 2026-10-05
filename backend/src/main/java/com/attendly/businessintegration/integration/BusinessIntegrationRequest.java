package com.attendly.businessintegration.integration;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record BusinessIntegrationRequest(
    @NotBlank @Size(max=120) String name,
    @NotBlank @Size(max=80) String provider,
    @NotBlank @Size(max=500) String endpointUrl
) {}
