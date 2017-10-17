package fr.ruben.clientmanagement.service;

import fr.ruben.clientmanagement.models.UserDto;
import fr.ruben.clientmanagement.repoInterface.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RubenEdery on 17/10/2017.
 */
@Service
public class UserService implements IUserService {

    static List<UserDto> userDtos = new ArrayList<>();

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

    public List<UserDto> createUser(UserDto userDto) {

        List<UserDto> userD = userDtos;

        userD.add(
                UserDto.builder()
                        .name("Tony")
                        .surname("Montana")
                        .build()
        );
        return userD;
    }

    public String updateUser(int numUser) {
        return "update";
    }

    public String getOneUser(int numUser) {
        return "user";
    }

    public String deleteUser(int numUser) {
        return "DeleteOneUser";
    }
}
