package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Yazar;
import com.example.veritabaniodev.Repo.YazarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YazarServiceImpl implements YazarService {

    @Autowired
    private YazarRepository yazarRepository;

    @Override
    public List<Yazar> getAllYazar() {
        return yazarRepository.findAll();
    }

    @Override
    public Optional<Yazar> getYazarById(Long id) {
        return yazarRepository.findById(id);
    }

    @Override
    public Yazar saveYazar(Yazar yazar) {
        return yazarRepository.save(yazar);
    }

    @Override
    public void deleteYazar(Long id) {
        yazarRepository.deleteById(id);
    }
}
