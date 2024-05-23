package com.example.veritabaniodev.Repo;

import com.example.veritabaniodev.Entity.YayineviAdres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YayineviAdresRepository extends JpaRepository<YayineviAdres, Long> {
}