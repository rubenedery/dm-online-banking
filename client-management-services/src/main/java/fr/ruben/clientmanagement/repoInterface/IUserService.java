package fr.ruben.clientmanagement.repoInterface;

import fr.ruben.clientmanagement.models.UserDto;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author EDERY RUBEN on 17/10/2017.
 */


public interface IUserService {

    //This methode mock all user
    public List<UserDto> mockUser();

    //This method should create user
    public List<UserDto> createUser(String name, String surname);

    //This method should update an user
    public String updateUser(String name);

    //This methode should get one user
    public String getOneUser(String name);
    
    //This methode should delete users
    public void deleteUser();
}
