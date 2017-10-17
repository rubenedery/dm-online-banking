package fr.ruben.clientmanagement.controller.services;

import fr.ruben.clientmanagement.models.UserDto;
import fr.ruben.clientmanagement.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by RubenEdery on 17/10/2017.
 */
@RestController
@RequestMapping("/user")
public class ControlerUserDto {

    private static Logger logger = Logger.getLogger(ControlerUserDto.class);


    UserService userService = new UserService();

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String home() {
        return "<H1>DM N ° 1</H1>";
    }

    @RequestMapping(value="/allClient", method= RequestMethod.GET)
    public List<UserDto> getAllUser() {
        return userService.getAllUserMock();
    }

}
