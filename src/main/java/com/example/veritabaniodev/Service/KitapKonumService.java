package com.example.veritabaniodev.Service;


import com.example.veritabaniodev.Entity.KitapKonum;
import com.example.veritabaniodev.Repo.KitapKonumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KitapKonumService {

    @Autowired
    private KitapKonumRepo kitapKonumRepository;

    public List<KitapKonum> getAllKitapKonum() {
        return kitapKonumRepository.findAll();
    }

    public Optional<KitapKonum> getKitapKonumById(Long id) {
        return kitapKonumRepository.findById(id);
    }

    public KitapKonum saveKitapKonum(KitapKonum kitapKonum) {
        return kitapKonumRepository.save(kitapKonum);
    }

    public void deleteKitapKonum(Long id) {
        kitapKonumRepository.deleteById(id);
    }
}

