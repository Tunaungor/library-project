package com.example.veritabaniodev.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User
{
//    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false, unique=true)
    private String email;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false)
    private Long yas;

    @Column(nullable=false)
    private Long telefon;

    @OneToMany(mappedBy = "user")
    private List<Rezervasyon> rezervasyonlar;



    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserAdres userAdres;


}