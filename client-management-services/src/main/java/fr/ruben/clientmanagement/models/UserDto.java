package fr.ruben.clientmanagement.models;

import lombok.Builder;
import lombok.Data;
/**
 * Created by RubenEdery on 17/10/2017.
 */


@Data
@Builder
public class UserDto {
    private String name;
    private String surname;
}
