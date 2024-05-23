package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.YayineviAdres;

import java.util.List;
import java.util.Optional;

public interface YayinEviAdresService {
    List<YayineviAdres> getAllYayineviAdres();
    Optional<YayineviAdres> getYayineviAdresById(Long id);
    YayineviAdres saveYayineviAdres(YayineviAdres yayineviAdres);
    void deleteYayineviAdres(Long id);
}
