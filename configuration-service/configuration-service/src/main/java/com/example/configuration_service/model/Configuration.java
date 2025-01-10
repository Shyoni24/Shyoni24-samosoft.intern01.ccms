package com.example.configuration_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "configurations")
public class Configuration {
    @Id
    private String id;
    private String clientId;
    private String settingKey;
    private String settingValue;

    // Getters and Setters

    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * @param clientId the clientId to set
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * @return String return the settingKey
     */
    public String getSettingKey() {
        return settingKey;
    }

    /**
     * @param settingKey the settingKey to set
     */
    public void setSettingKey(String settingKey) {
        this.settingKey = settingKey;
    }

    /**
     * @return String return the settingValue
     */
    public String getSettingValue() {
        return settingValue;
    }

    /**
     * @param settingValue the settingValue to set
     */
    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue;
    }

}
