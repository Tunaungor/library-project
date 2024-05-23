package com.example.veritabaniodev.Repo;

import com.example.veritabaniodev.Entity.YayinEvi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YayinEviRepository extends JpaRepository<YayinEvi, Long> {
}
