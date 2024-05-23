package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.UserAdres;

import java.util.List;
import java.util.Optional;

public interface UserAdresService {
    List<UserAdres> getAllUserAdres();
    Optional<UserAdres> getUserAdresById(Long id);
    UserAdres saveUserAdres(UserAdres userAdres);
    void deleteUserAdres(Long id);
}
