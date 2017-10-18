package fr.ruben.clientmanagement.repoInterface;

import fr.ruben.clientmanagement.models.UserDto;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author EDERY RUBEN on 17/10/2017.
 */
public interface IUserService {

    public List<UserDto> mockUser();

    public List<UserDto> createUser(String name, String surname);

    public String updateUser(String name);

    public String getOneUser(String name);

    public void deleteUser();
}
