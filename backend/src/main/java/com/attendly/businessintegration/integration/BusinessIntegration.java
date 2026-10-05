package com.attendly.businessintegration.integration;

import jakarta.persistence.*;

@Entity
@Table(name = "business_integrations")
public class BusinessIntegration {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 120) private String name;
    @Column(nullable = false, length = 80) private String provider;
    @Column(nullable = false, length = 500) private String endpointUrl;

    protected BusinessIntegration() {}
    public BusinessIntegration(String name, String provider, String endpointUrl) { this.name=name; this.provider=provider; this.endpointUrl=endpointUrl; }
    public Long getId(){return id;} public String getName(){return name;} public String getProvider(){return provider;} public String getEndpointUrl(){return endpointUrl;}
    public void setName(String v){name=v;} public void setProvider(String v){provider=v;} public void setEndpointUrl(String v){endpointUrl=v;}
}
