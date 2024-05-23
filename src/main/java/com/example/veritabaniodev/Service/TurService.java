package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Tur;

import java.util.List;
import java.util.Optional;

public interface TurService {
    List<Tur> getAllTur();
    Optional<Tur> getTurById(Long id);
    Tur saveTur(Tur tur);
    void deleteTur(Long id);
}
