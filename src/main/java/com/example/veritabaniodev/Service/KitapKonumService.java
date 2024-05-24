package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Gorevli;
import com.example.veritabaniodev.Entity.KitapKonum;
import com.example.veritabaniodev.Entity.User;

import java.util.List;

public interface KitapKonumService {
    List<KitapKonum> getAllKitapKonum();
    KitapKonum getKitapKonumById(Long id);
    KitapKonum saveKitapKonum(KitapKonum kitapKonum);
    void deleteKitapKonum(Long id);


}
