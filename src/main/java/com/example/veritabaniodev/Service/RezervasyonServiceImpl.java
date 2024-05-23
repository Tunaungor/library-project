package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Rezervasyon;
import com.example.veritabaniodev.Repo.RezervasyonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RezervasyonServiceImpl implements RezervasyonService {

    @Autowired
    private RezervasyonRepository rezervasyonRepository;

    @Override
    public List<Rezervasyon> getAllRezervasyon() {
        return rezervasyonRepository.findAll();
    }

    @Override
    public Optional<Rezervasyon> getRezervasyonById(Long id) {
        return rezervasyonRepository.findById(id);
    }

    @Override
    public Rezervasyon saveRezervasyon(Rezervasyon rezervasyon) {
        return rezervasyonRepository.save(rezervasyon);
    }

    @Override
    public void deleteRezervasyon(Long id) {
        rezervasyonRepository.deleteById(id);
    }
}