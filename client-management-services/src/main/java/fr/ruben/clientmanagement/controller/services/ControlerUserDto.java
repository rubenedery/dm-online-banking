package fr.ruben.clientmanagement.controller.services;

import fr.ruben.clientmanagement.models.UserDto;
import fr.ruben.clientmanagement.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by RubenEdery on 17/10/2017.
 */
@RestController
@RequestMapping("/user")
public class ControlerUserDto {

    private static Logger logger = Logger.getLogger(ControlerUserDto.class);

    @Autowired
    UserService userService;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String home() {
        return "<H1>DM N ° 1</H1>";
    }

    @RequestMapping(value="/allClient", method= RequestMethod.GET)
    public List<UserDto> getAllUser() {
        return userService.getAllUserMock();
    }

    @RequestMapping(value="/oneClient", method= RequestMethod.GET)
    public String getOneUser(@RequestParam String name) {
        return userService.getOneUser(name);
    }

    @RequestMapping(value="/oneClient", method= RequestMethod.GET)
    public String createUser(@RequestParam String name) {
        return userService.getOneUser(name);
    }

}
