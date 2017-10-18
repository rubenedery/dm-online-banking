package fr.ruben.clientmanagement.service;

import fr.ruben.clientmanagement.models.UserDto;
import fr.ruben.clientmanagement.repoInterface.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author EDERY RUBEN on 17/10/2017.
 */
@Service
public class UserService implements IUserService {

    static List<UserDto> userDtos = new ArrayList<>();
    
    
    /**
     * With Override we redefine method in the interface
     */
    @Override
    public List<UserDto> mockUser() {
        userDtos.add(
                UserDto.builder()
                        .name("Ruben")
                        .surname("Edery")
                        .build()
        );
        userDtos.add(
                UserDto.builder()
                        .name("Thibault")
                        .surname("Bourgeois")
                        .build()
        );
        return userDtos;
    }
    
    public List<UserDto> getAllUserMock() {
        return mockUser();
    }
    
    @Override
    public List<UserDto> createUser(String name, String surname) {

        List<UserDto> userD = userDtos;
        userD.add(
                UserDto.builder()
                        .name(name)
                        .surname(surname)
                        .build()
        );
        return userD;
    }
    
    @Override
    public String updateUser(String name) {
        return "User is update";
    }
    
    @Override
    public String getOneUser(String name) {
        return name;
    }
    
    @Override
    public void deleteUser() {
        userDtos.remove(getOneUser("ruben"));
    }
}
