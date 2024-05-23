package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Tur;
import com.example.veritabaniodev.Repo.TurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurServiceImpl implements TurService {

    @Autowired
    private TurRepository turRepository;

    @Override
    public List<Tur> getAllTur() {
        return turRepository.findAll();
    }

    @Override
    public Optional<Tur> getTurById(Long id) {
        return turRepository.findById(id);
    }

    @Override
    public Tur saveTur(Tur tur) {
        return turRepository.save(tur);
    }

    @Override
    public void deleteTur(Long id) {
        turRepository.deleteById(id);
    }
}