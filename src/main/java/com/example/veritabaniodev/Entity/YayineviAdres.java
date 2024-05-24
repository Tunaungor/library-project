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
@Table(name = "YayineviAdres")
public class YayineviAdres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true)
    private Long YayineviAdresId;

    private String mahalle;

    private String sokak;

    private String sehir;

    private String apartman;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "yayin_evi_id")
    private YayinEvi yayinEvi;
}
