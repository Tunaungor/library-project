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
@Table(name = "Tur")
public class Tur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String katagori;

    @OneToMany(mappedBy = "tur")
    private Set<Kitap> kitaplar;
}
