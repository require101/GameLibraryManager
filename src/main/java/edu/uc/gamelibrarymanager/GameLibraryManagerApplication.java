package edu.uc.gamelibrarymanager;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.io.FileInputStream;
import java.io.IOException;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class GameLibraryManagerApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(GameLibraryManagerApplication.class, args);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedHeader("X-Firebase-Auth");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }

    @Bean
    public FirebaseAuth firebaseAuth() throws IOException {

        FileInputStream serviceAccount = new FileInputStream(
                "serviceAccount.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://gamelibrarymanager.firebaseio.com").build();

        FirebaseApp.initializeApp(options);

        return FirebaseAuth.getInstance();
    }
}
