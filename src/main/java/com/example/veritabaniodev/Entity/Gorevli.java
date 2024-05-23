package com.example.veritabaniodev.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "Gorevli")
public class Gorevli {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gorevli_id")
    private Long GorevliId;

    private String name;

    private String soyad;

    private String kullaniciAdi;

    private Long telefon;

    private String mail;

    private String sifre;

    @OneToOne(mappedBy = "gorevli", cascade = CascadeType.ALL)
    private GorevliAdres adres; // GorevliAdres ile ilişki

    @OneToMany(mappedBy = "gorevli")
    private Set<Kitap> kitaplar;


}

