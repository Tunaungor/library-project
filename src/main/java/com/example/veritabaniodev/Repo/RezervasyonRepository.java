package com.example.veritabaniodev.Repo;

import com.example.veritabaniodev.Entity.Rezervasyon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervasyonRepository extends JpaRepository<Rezervasyon,Long> {
}
