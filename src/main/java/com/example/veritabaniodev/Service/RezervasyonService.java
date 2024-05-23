package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Rezervasyon;

import java.util.List;
import java.util.Optional;

public interface RezervasyonService {
    List<Rezervasyon> getAllRezervasyon();
    Optional<Rezervasyon> getRezervasyonById(Long id);
    Rezervasyon saveRezervasyon(Rezervasyon rezervasyon);
    void deleteRezervasyon(Long id);
}
