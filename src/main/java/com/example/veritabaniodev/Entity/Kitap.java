package com.example.veritabaniodev.Entity;

import com.example.veritabaniodev.Dto.KitapDto;
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
    private Long kid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int sayfaSayisi;

    @Column(nullable = false)
    private Date yayinTarihi;

    @Column(nullable = false)
    private int stok;

    @ManyToOne
    @JoinColumn(name = "tur_id", nullable = false)
    private Tur tur;

    @ManyToMany
    @JoinTable(
            name = "kitap_yazar",
            joinColumns = @JoinColumn(name = "kitap_id"),
            inverseJoinColumns = @JoinColumn(name = "yazar_id")
    )
    private Set<Yazar> yazarlar;

    @ManyToOne
    @JoinColumn(name = "gorevli_id", nullable = false)
    private Gorevli gorevli;

    @ManyToOne
    @JoinColumn(name = "yayin_evi_id", nullable = false)
    private YayinEvi yayinEvi;

    @ManyToOne
    @JoinColumn(name = "odunc_id")
    private Odunc odunc; // Bu satırı ekledik

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
