package com.example.configuration_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.configuration_service.model.Configuration;
import com.example.configuration_service.repository.ConfigurationRepository;

@Service
public class ConfigurationService {
    @Autowired
    private ConfigurationRepository configurationRepository;

    public List<Configuration> getConfigurationsByClientId(String clientId) {
        return configurationRepository.findByClientId(clientId);
    }

    public Configuration createConfiguration(Configuration configuration) {
        return configurationRepository.save(configuration);
    }

    public void deleteConfiguration(String id) {
        configurationRepository.deleteById(id);
    }
}
