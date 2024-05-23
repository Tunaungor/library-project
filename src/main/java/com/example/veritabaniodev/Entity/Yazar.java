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
@Table(name = "Yazar")
public class Yazar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private Long telefon;

    @ManyToMany(mappedBy = "yazarlar")
    private Set<Kitap> kitaplar;

    @OneToOne(mappedBy = "yazar", cascade = CascadeType.ALL)
    private YazarAdres yazarAdres;
}
