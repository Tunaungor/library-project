package com.example.veritabaniodev.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "GorevliAdres")
public class GorevliAdres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long GorevliAdresId;

    private String mahalle;

    private String sokak;

    private String sehir;

    private String apartman;

    @OneToOne
    @JoinColumn(name = "gorevli_id")
    private Gorevli gorevli; // Gorevli ile ilişki

}
