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
@Table(name = "Yazar")
public class Yazar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private Long telefon;

    @JsonIgnore
    @ManyToMany(mappedBy = "yazarlar")
    private Set<Kitap> kitaplar;

    @JsonIgnore
    @OneToOne(mappedBy = "yazar", cascade = CascadeType.ALL)
    private YazarAdres yazarAdres;
}
