package fr.ruben.clientmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by RubenEdery on 17/10/2017.
 */
@SpringBootApplication
public class MainApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
