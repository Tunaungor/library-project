package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Dto.UserDto;
import com.example.veritabaniodev.Entity.User;

import java.util.List;

public interface UserService {
    User registerUser(UserDto userDto);
    User login(String email, String password);
    User getUserById(Long id);
    User getUserByName(String name);
    User updateUser(Long id, UserDto userDto);

    void addAllUsers(List<User> userList);
}
