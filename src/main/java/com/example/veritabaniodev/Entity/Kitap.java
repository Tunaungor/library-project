package com.example.veritabaniodev.Entity;

import com.example.veritabaniodev.Dto.KitapDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "Kitap")
public class Kitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true)
    private Long kid;

    @Column(nullable = true)
    private String name;

    @Column(nullable = true)
    private int sayfaSayisi;

    @Column(nullable = true)
    private Date yayinTarihi;

    @Column(nullable = true)
    private int stok;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tur_id", nullable = true)
    private Tur tur;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "kitap_yazar",
            joinColumns = @JoinColumn(name = "kitap_id"),
            inverseJoinColumns = @JoinColumn(name = "yazar_id")
    )
    private Set<Yazar> yazarlar;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "gorevli_id", nullable = true)
    private Gorevli gorevli;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "yayin_evi_id", nullable = true)
    private YayinEvi yayinEvi;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "odunc_id" ,nullable = true)
    private Odunc odunc; // Bu satırı ekledik

    @JsonIgnore
    @OneToOne(mappedBy = "kitap")
    private KitapKonum kitapKonum;

    @JsonIgnore
    @OneToOne(mappedBy = "kitap")
    private Rezervasyon rezervasyon;

    public static Kitap fromDto(KitapDto kitapDto) {
        Kitap kitap = new Kitap();
        kitap.setName(kitapDto.getName());
        kitap.setSayfaSayisi(kitapDto.getSayfaSayisi());
        kitap.setYayinTarihi(kitapDto.getYayinTarihi());
        kitap.setStok(kitapDto.getStok());
        return kitap;
    }

}
