package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.YazarAdres;

import java.util.List;
import java.util.Optional;

public interface YazarAdresService {
    List<YazarAdres> getAllYazarAdres();
    Optional<YazarAdres> getYazarAdresById(Long id);
    YazarAdres saveYazarAdres(YazarAdres yazarAdres);
    void deleteYazarAdres(Long id);
}
