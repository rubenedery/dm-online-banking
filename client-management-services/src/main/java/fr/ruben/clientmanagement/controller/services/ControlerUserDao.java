package fr.ruben.clientmanagement.controller.services;

import fr.ruben.clientmanagement.users.models.UserDto;
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

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public List<UserDto> getMockUsers() {
        List<UserDto> userDtos = new ArrayList<>();
        return getMock();
    }


    public List<UserDto> getMock() {
        List<UserDto> itineraryItems = new ArrayList<>();
        itineraryItems.add(
                UserDto.builder()
                        .name("Ruben")
                        .surname("Edery")
                        .build()
        );
        itineraryItems.add(
                UserDto.builder()
                        .name("Thibault")
                        .surname("Bourgeois")
                        .build()
        );
        return itineraryItems;
    }

}
