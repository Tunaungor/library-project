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
@Table(name = "YayinEvi")
public class YayinEvi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true)
    private Long yayinEviId;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private Long telefon;

    @JsonIgnore
    @OneToMany(mappedBy = "yayinEvi")
    private Set<Kitap> kitaplar;

    @JsonIgnore
    @OneToOne(mappedBy = "yayinEvi", cascade = CascadeType.ALL)
    private YayineviAdres yayineviAdres;
}
