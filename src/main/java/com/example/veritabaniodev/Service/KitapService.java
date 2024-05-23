package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Kitap;

import java.util.List;
import java.util.Optional;

public interface KitapService {
    List<Kitap> getAllKitap();
    Optional<Kitap> getKitapById(Long id);
    Kitap saveKitap(Kitap kitap);
    void deleteKitap(Long id);
}
