package com.example.veritabaniodev.Repo;

import com.example.veritabaniodev.Entity.Yazar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YazarRepository extends JpaRepository <Yazar,Long> {
}
