package com.attendly.businessintegration.integration;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/integrations")
@Tag(name="Business integrations")
public class BusinessIntegrationController {
    private final BusinessIntegrationService service;
    public BusinessIntegrationController(BusinessIntegrationService service){this.service=service;}

    @GetMapping
    @Operation(summary="List configured integrations")
    public List<BusinessIntegration> list(){return service.findAll();}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary="Create an integration")
    public BusinessIntegration create(@Valid @RequestBody BusinessIntegrationRequest request){
        return service.create(new BusinessIntegration(request.name(), request.provider(), request.endpointUrl()));
    }
}
