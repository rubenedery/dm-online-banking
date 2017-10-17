package fr.ruben.clientmanagement.users.models;

import lombok.Builder;
import lombok.Data;

/**
 * Created by RubenEdery on 16/10/2017.
 */
@Data
@Builder
public class UserDto {
    private String name;
    private String surname;
}
