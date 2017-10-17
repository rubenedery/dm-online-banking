package fr.ruben.clientmanagement.controller.services;

import fr.ruben.clientmanagement.models.UserDto;
import fr.ruben.clientmanagement.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
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


    UserService userService = new UserService();

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String home() {
        return "<H1>DM N ° 1</H1>";
    }

    @RequestMapping(value="/allCloent", method= RequestMethod.GET)
    public List<UserDto> getAllUser() {
        logger.info("MESSAGEPOURMOI");
        return userService.getAllUserMock();
    }

}
