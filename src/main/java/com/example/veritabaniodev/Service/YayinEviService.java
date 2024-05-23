package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.YayinEvi;

import java.util.List;
import java.util.Optional;

public interface YayinEviService {
    List<YayinEvi> getAllYayinEvi();
    Optional<YayinEvi> getYayinEviById(Long id);
    YayinEvi saveYayinEvi(YayinEvi yayinEvi);
    void deleteYayinEvi(Long id);
}
