package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Gorevli;

public interface GorevliService {
    Gorevli getGorevliById(Long id);
    Gorevli saveOrUpdateGorevli(Gorevli gorevli);
    void deleteGorevliById(Long id);
}
