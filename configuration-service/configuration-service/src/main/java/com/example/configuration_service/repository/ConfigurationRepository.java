package com.example.configuration_service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.configuration_service.model.Configuration;

public interface ConfigurationRepository extends MongoRepository<Configuration, String> {
    List<Configuration> findByClientId(String clientId);
}
