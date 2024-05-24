package com.example.veritabaniodev.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "gorevli_id" ,nullable = true)
    private Long id;

    private String name;

    private String soyad;

    private String kullaniciAdi;

    private Long telefon;

    private String mail;

    private String sifre;

    @JsonIgnore
    @OneToOne(mappedBy = "gorevli", cascade = CascadeType.ALL)
    private GorevliAdres adres; // GorevliAdres ile ilişki
    @JsonIgnore
    @OneToMany(mappedBy = "gorevli")
    private Set<Kitap> kitaplar;


}

