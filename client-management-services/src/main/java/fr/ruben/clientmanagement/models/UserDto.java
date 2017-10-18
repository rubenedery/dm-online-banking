package fr.ruben.clientmanagement.models;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @Author  EDERY RUBEN on 17/10/2017.
 */

/**
 * Define an userdto with a name and a surname
 */
@Data
@Builder
@RequiredArgsConstructor
public class UserDto {
    private String name;
    private String surname;

    public UserDto (String name,String surname){
        this.name=name;
        this.surname=surname;
    }
}
