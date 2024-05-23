package com.example.veritabaniodev.Repo;

import com.example.veritabaniodev.Entity.Tur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurRepository extends JpaRepository<Tur, Long> {
}