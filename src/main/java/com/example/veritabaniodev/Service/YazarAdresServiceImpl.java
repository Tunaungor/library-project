package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.KitapKonum;
import com.example.veritabaniodev.Entity.YazarAdres;
import com.example.veritabaniodev.Repo.YazarAdresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YazarAdresServiceImpl implements YazarAdresService {

    @Autowired
    private YazarAdresRepository yazarAdresRepository;

    @Override
    public List<YazarAdres> getAllYazarAdres() {
        return yazarAdresRepository.findAll();
    }

    @Override
    public Optional<YazarAdres> getYazarAdresById(Long id) {
        return yazarAdresRepository.findById(id);
    }

    @Override
    public YazarAdres saveYazarAdres(YazarAdres yazarAdres) {
        return yazarAdresRepository.save(yazarAdres);
    }

    @Override
    public void deleteYazarAdres(Long id) {
        yazarAdresRepository.deleteById(id);
    }

    public YazarAdres updateYazarAdres(YazarAdres yazarAdres) {
        return yazarAdresRepository.save(yazarAdres);
    }
}
