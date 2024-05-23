package com.example.veritabaniodev.Dto;



import com.example.veritabaniodev.Entity.Kitap;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class KitapDto {


    private String name;


    private int sayfaSayisi;


    private Date yayinTarihi;

    private int stok;

    public static KitapDto fromEntity(Kitap kitap) {
        KitapDto kitapDto = new KitapDto();
        kitapDto.setName(kitap.getName());
        kitapDto.setSayfaSayisi(kitap.getSayfaSayisi());
        kitapDto.setYayinTarihi(kitap.getYayinTarihi());
        kitapDto.setStok(kitap.getStok());
        return kitapDto;
    }
}