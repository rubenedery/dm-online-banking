package fr.ruben.clientmanagement.models;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by RubenEdery on 17/10/2017.
 */


@Data
@Builder
@RequiredArgsConstructor
public class UserDto {
    private String name;
    private String surname;
}
