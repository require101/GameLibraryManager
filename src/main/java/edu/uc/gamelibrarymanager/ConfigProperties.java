package edu.uc.gamelibrarymanager;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "config")
public class ConfigProperties {
    private String steamAPIKey;

    public String getSteamApiKey() {
        return steamAPIKey;
    }

    public void setSteamApiKey(String steamApiKey) {
        this.steamAPIKey = steamApiKey;
    }
}
