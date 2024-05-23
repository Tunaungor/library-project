package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Gorevli;
import com.example.veritabaniodev.Repo.GorevliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GorevliServiceImpl implements GorevliService{

    @Autowired
    private GorevliRepository gorevliRepository;

    @Override
    public Gorevli getGorevliById(Long id) {
        Optional<Gorevli> optionalGorevli = gorevliRepository.findById(id);
        return optionalGorevli.orElse(null);
    }
    @Override
    public void deleteGorevliById(Long id) {
        gorevliRepository.deleteById(id);
    }


    public Gorevli updateGorevli(Gorevli gorevli) {
        return gorevliRepository.save(gorevli);
    }
    @Override
    public Gorevli saveOrUpdateGorevli(Gorevli gorevli) {
        return gorevliRepository.save(gorevli);
    }


    public boolean girisYap(String kullaniciAdi, String sifre) {
        Gorevli gorevli = gorevliRepository.findByKullaniciAdiAndSifre(kullaniciAdi, sifre);
        return gorevli != null && sifre.equals("123456");
    }

}