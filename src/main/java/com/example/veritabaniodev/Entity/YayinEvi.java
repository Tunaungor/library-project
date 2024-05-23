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
@Table(name = "YayinEvi")
public class YayinEvi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long yayinEviId;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private Long telefon;

    @OneToMany(mappedBy = "yayinEvi")
    private Set<Kitap> kitaplar;

    @OneToOne(mappedBy = "yayinEvi", cascade = CascadeType.ALL)
    private YayineviAdres yayineviAdres;
}
