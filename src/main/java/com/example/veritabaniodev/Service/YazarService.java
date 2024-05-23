package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Yazar;

import java.util.List;
import java.util.Optional;

public interface YazarService {
    List<Yazar> getAllYazar();
    Optional<Yazar> getYazarById(Long id);
    Yazar saveYazar(Yazar yazar);
    void deleteYazar(Long id);
}
