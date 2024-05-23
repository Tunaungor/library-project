package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.UserAdres;
import com.example.veritabaniodev.Repo.UserAdresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserAdresServiceImpl implements UserAdresService {

    @Autowired
    private UserAdresRepository userAdresRepository;

    @Override
    public List<UserAdres> getAllUserAdres() {
        return userAdresRepository.findAll();
    }

    @Override
    public Optional<UserAdres> getUserAdresById(Long id) {
        return userAdresRepository.findById(id);
    }

    @Override
    public UserAdres saveUserAdres(UserAdres userAdres) {
        return userAdresRepository.save(userAdres);
    }

    @Override
    public void deleteUserAdres(Long id) {
        userAdresRepository.deleteById(id);
    }
}
