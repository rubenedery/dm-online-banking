package fr.ruben.clientmanagement.controller.services;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RubenEdery on 17/10/2017.
 */
@RestController
@SpringBootApplication
@RequestMapping("/user")
public class ControlerUserDao {

    public static void main(String[] args) {
        SpringApplication.run(ControlerUserDao.class, args);
    }

    private static Logger logger = Logger.getLogger(ControlerUserDao.class);


    public List<String> getMockUsers() {
        List<String> userDtos = new ArrayList<String>();
        userDtos.add("Ruben");
        return userDtos;
    }


}
