package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Odunc;

import java.util.List;
import java.util.Optional;

public interface OduncService {
    List<Odunc> getAllOdunc();
    Optional<Odunc> getOduncById(Long id);
    Odunc saveOdunc(Odunc odunc);
    void deleteOdunc(Long id);
}
