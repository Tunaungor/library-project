package com.example.veritabaniodev.Repo;


import com.example.veritabaniodev.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);
    User findByName(String name);

}