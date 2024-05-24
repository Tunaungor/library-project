package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Kitap;
import com.example.veritabaniodev.Entity.KitapKonum;
import com.example.veritabaniodev.Repo.KitapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KitapServiceImpl implements KitapService {

    @Autowired
    private KitapRepository kitapRepository;

    @Override
    public List<Kitap> getAllKitap() {
        return kitapRepository.findAll();
    }

    @Override
    public Optional<Kitap> getKitapById(Long id) {
        return kitapRepository.findById(id);
    }

    @Override
    public Kitap saveKitap(Kitap kitap) {
        return kitapRepository.save(kitap);
    }

    @Override
    public void deleteKitap(Long id) {
        kitapRepository.deleteById(id);
    }
    public Kitap updateKitap(Kitap kitap) {
        return kitapRepository.save(kitap);
    }
}