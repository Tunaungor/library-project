package com.example.veritabaniodev.Repo;

import com.example.veritabaniodev.Entity.UserAdres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAdresRepository extends JpaRepository<UserAdres, Long> {
}