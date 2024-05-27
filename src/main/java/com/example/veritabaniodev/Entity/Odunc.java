package com.example.veritabaniodev.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
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
    @Column(nullable = true)
    private Long kid;



    private LocalDate alisTarihi;

    @Column(nullable=true)
    private Date verisTarihi;

    @Column(nullable=false)
    private Long telefon;

    @Column(nullable=false)
    private boolean karaListe;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "kitap_id", nullable = true )
    private Kitap kitap;

    @JsonIgnore
    @OneToMany(mappedBy = "odunc" )
    private Set<Kitap> kitaplar;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true )
    private User user; // "user" özelliğinin adını "user" olarak güncelledik
}
