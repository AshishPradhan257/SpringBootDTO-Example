package net.javaguides.springboot_dto_tutorial.dto;

import lombok.Data;

//we don't want to send all the entities of user to the client,
//not the firstname or the lastname or the password, just the required information
//that's why we use DTO!
@Data
public class UserLocationDTO {
    private long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
