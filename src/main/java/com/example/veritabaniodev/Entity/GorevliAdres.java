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
@Table(name = "GorevliAdres")
public class GorevliAdres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true)
    private Long GorevliAdresId;

    private String mahalle;

    private String sokak;

    private String sehir;

    private String apartman;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "gorevli_id")
    private Gorevli gorevli; // Gorevli ile ilişki

}
