package com.example.notification_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name = "configuration-service", url = "http://localhost:8081/api/configurations")
public interface ConfigurationClient {
    @GetMapping("/{clientId}")
    List<Object> getConfigurationsByClientId(@PathVariable("clientId") String clientId);
}
