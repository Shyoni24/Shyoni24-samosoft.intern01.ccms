package com.example.configuration_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.configuration_service.model.Configuration;
import com.example.configuration_service.service.ConfigurationService;

@RestController
@RequestMapping("/api/configurations")
public class ConfigurationController {
    @Autowired
    private ConfigurationService configurationService;

    @GetMapping("/{clientId}")
    public List<Configuration> getConfigurationsByClientId(@PathVariable String clientId) {
        return configurationService.getConfigurationsByClientId(clientId);
    }

    @PostMapping
    public Configuration createConfiguration(@RequestBody Configuration configuration) {
        return configurationService.createConfiguration(configuration);
    }

    @DeleteMapping("/{id}")
    public void deleteConfiguration(@PathVariable String id) {
        configurationService.deleteConfiguration(id);
    }
}
