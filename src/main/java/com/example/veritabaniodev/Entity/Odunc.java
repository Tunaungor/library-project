package com.example.veritabaniodev.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "Odunc")
public class Odunc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kid;



    private Date alisTarihi;

    @Column(nullable=true)
    private Date verisTarihi;

    @Column(nullable=false)
    private Long telefon;

    @Column(nullable=false)
    private boolean karaListe;

    @ManyToOne
    @JoinColumn(name = "kitap_id", nullable = false)
    private Kitap kitap;

    @OneToMany(mappedBy = "odunc")
    private Set<Kitap> kitaplar;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // "user" özelliğinin adını "user" olarak güncelledik
}
