package com.example.veritabaniodev.Repo;

import com.example.veritabaniodev.Entity.Gorevli;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GorevliRepository extends JpaRepository <Gorevli, Long> {

    Gorevli findByKullaniciAdiAndSifre(String kullaniciAdi, String sifre);
}
