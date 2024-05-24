package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.KitapKonum;
import com.example.veritabaniodev.Entity.YayinEvi;
import com.example.veritabaniodev.Repo.YayinEviRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YayinEviServiceImpl implements YayinEviService {

    @Autowired
    private YayinEviRepository yayinEviRepository;

    @Override
    public List<YayinEvi> getAllYayinEvi() {
        return yayinEviRepository.findAll();
    }

    @Override
    public Optional<YayinEvi> getYayinEviById(Long id) {
        return yayinEviRepository.findById(id);
    }

    @Override
    public YayinEvi saveYayinEvi(YayinEvi yayinEvi) {
        return yayinEviRepository.save(yayinEvi);
    }

    @Override
    public void deleteYayinEvi(Long id) {
        yayinEviRepository.deleteById(id);
    }
    public YayinEvi updateYayınEvi(YayinEvi yayinEvi) {
        return yayinEviRepository.save(yayinEvi);
    }
}
