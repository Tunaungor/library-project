package com.example.veritabaniodev.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "YazarAdres")
public class YazarAdres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long YazarAdresId;

    private String mahalle;

    private String sokak;

    private String sehir;

    private String apartman;

    @OneToOne
    @JoinColumn(name = "yazar_id")
    private Yazar yazar;
}
