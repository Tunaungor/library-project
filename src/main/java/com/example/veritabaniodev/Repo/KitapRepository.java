package com.example.veritabaniodev.Repo;

import com.example.veritabaniodev.Entity.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitapRepository extends JpaRepository <Kitap,Long> {
}
