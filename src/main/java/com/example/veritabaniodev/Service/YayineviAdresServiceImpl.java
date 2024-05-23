package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.YayineviAdres;
import com.example.veritabaniodev.Repo.YayineviAdresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YayineviAdresServiceImpl implements YayinEviAdresService {

    @Autowired
    private YayineviAdresRepository yayineviAdresRepository;

    @Override
    public List<YayineviAdres> getAllYayineviAdres() {
        return yayineviAdresRepository.findAll();
    }

    @Override
    public Optional<YayineviAdres> getYayineviAdresById(Long id) {
        return yayineviAdresRepository.findById(id);
    }

    @Override
    public YayineviAdres saveYayineviAdres(YayineviAdres yayineviAdres) {
        return yayineviAdresRepository.save(yayineviAdres);
    }

    @Override
    public void deleteYayineviAdres(Long id) {
        yayineviAdresRepository.deleteById(id);
    }
}
