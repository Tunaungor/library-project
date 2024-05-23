package com.example.veritabaniodev.Repo;

import com.example.veritabaniodev.Entity.KitapKonum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitapKonumRepo extends JpaRepository <KitapKonum,Long> {
}
