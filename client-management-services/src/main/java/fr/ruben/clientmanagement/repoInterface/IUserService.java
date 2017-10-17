package fr.ruben.clientmanagement.repoInterface;

import fr.ruben.clientmanagement.models.UserDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RubenEdery on 17/10/2017.
 */
public interface IUserService {

    public List<UserDto> mockUser();

    public List<UserDto> createUser(UserDto userDto);

    public String updateUser(int numUser);

    public String getOneUser(int numUser);

    public String deleteUser(int numUser);
}
