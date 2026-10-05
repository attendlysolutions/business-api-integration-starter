package com.attendly.businessintegration.integration;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BusinessIntegrationService {
    private final BusinessIntegrationRepository repository;
    public BusinessIntegrationService(BusinessIntegrationRepository repository){this.repository=repository;}
    public List<BusinessIntegration> findAll(){return repository.findAll();}
    public BusinessIntegration create(BusinessIntegration input){return repository.save(input);}
}
