package com.example.veritabaniodev.Dto;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{


    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Long yas;

    private Long telefon;
}
