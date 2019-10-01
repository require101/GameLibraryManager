package edu.uc.gamelibrarymanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class GameLibraryManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameLibraryManagerApplication.class, args);
    }
}
