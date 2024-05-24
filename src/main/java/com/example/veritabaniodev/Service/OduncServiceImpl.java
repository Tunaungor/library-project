package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Kitap;
import com.example.veritabaniodev.Entity.KitapKonum;
import com.example.veritabaniodev.Entity.Odunc;
import com.example.veritabaniodev.Entity.User;
import com.example.veritabaniodev.Repo.KitapRepository;
import com.example.veritabaniodev.Repo.OduncRepository;
import com.example.veritabaniodev.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class OduncServiceImpl implements OduncService {

    @Autowired
    private OduncRepository oduncRepository;

    private KitapRepository kitapRepository;

    private UserRepository userRepository;

    @Override
    public List<Odunc> getAllOdunc() {
        return oduncRepository.findAll();
    }

    @Override
    public Optional<Odunc> getOduncById(Long id) {
        return oduncRepository.findById(id);
    }

    @Override
    public Odunc saveOdunc(Odunc odunc) {
        return oduncRepository.save(odunc);
    }

    @Override
    public void deleteOdunc(Long id) {
        oduncRepository.deleteById(id);
    }

    public Odunc updateOdunc(Odunc odunc) {
        return oduncRepository.save(odunc);
    }

    }
