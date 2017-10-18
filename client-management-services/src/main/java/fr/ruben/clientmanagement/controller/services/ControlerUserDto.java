package fr.ruben.clientmanagement.controller.services;

import fr.ruben.clientmanagement.models.UserDto;
import fr.ruben.clientmanagement.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author EDERY RUBEN on 17/10/2017.
 */
@RestController
@RequestMapping("/user")
public class ControlerUserDto {

    private static Logger logger = Logger.getLogger(ControlerUserDto.class);

    @Autowired
    UserService userService;

    @RequestMapping(value="/alluser", method= RequestMethod.GET)
    public List<UserDto> getAllUser() {

		return userService.getAllUserMock();
    }

    @RequestMapping(value="/oneuser", method= RequestMethod.GET)
    public String getOneUser(@RequestParam String name) {

        return userService.getOneUser(name);
    }

    @RequestMapping(value="/createuser", method= RequestMethod.POST)
    public List<UserDto> createUser(@RequestParam String name, @RequestParam String surname) {

        return userService.createUser(name,surname);
    }

    @RequestMapping(value="/updateuser", method= RequestMethod.PUT)
    public String updateUser(@RequestParam String name) {

        return userService.updateUser(name);
    }

    @RequestMapping(value="/deleteuser", method= RequestMethod.DELETE)
    public String deleteUser(){
        return deleteUser();
    }

}
