package com.example.veritabaniodev.Repo;

import com.example.veritabaniodev.Entity.Odunc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OduncRepository extends JpaRepository<Odunc, Long> {
    Odunc findByKid(Long kid);
}
