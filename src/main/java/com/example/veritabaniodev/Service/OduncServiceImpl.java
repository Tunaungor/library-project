package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Odunc;
import com.example.veritabaniodev.Repo.OduncRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OduncServiceImpl implements OduncService {

    @Autowired
    private OduncRepository oduncRepository;

    @Override
    public List<Odunc> getAllOdunc() {
        return oduncRepository.findAll();
    }

    @Override
    public Optional<Odunc> getOduncById(Long id) {
        return oduncRepository.findById(id);
    }

    @Override
    public Odunc saveOdunc(Odunc odunc) {
        return oduncRepository.save(odunc);
    }

    @Override
    public void deleteOdunc(Long id) {
        oduncRepository.deleteById(id);
    }
}