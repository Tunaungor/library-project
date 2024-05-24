package com.example.veritabaniodev.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(nullable = true)
    private Long YazarAdresId;

    private String mahalle;

    private String sokak;

    private String sehir;

    private String apartman;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "yazar_id")
    private Yazar yazar;
}
