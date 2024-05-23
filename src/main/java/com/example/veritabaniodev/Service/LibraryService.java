package com.example.veritabaniodev.Service;

import com.example.veritabaniodev.Entity.Gorevli;
import com.example.veritabaniodev.Entity.Kitap;
import com.example.veritabaniodev.Entity.Odunc;
import com.example.veritabaniodev.Repo.GorevliRepository;
import com.example.veritabaniodev.Repo.KitapRepository;
import com.example.veritabaniodev.Repo.OduncRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    private final KitapRepository kitapRepository;
    private final OduncRepository oduncRepository;
    private final GorevliRepository gorevliRepository;

    public LibraryService(KitapRepository kitapRepository, OduncRepository oduncRepository, GorevliRepository gorevliRepository) {
        this.kitapRepository = kitapRepository;
        this.oduncRepository = oduncRepository;
        this.gorevliRepository = gorevliRepository;
    }

    @Transactional
    public void oduncVer(Long kitapId) {
        Kitap kitap = kitapRepository.findById(kitapId).orElseThrow();
        kitap.setStok(kitap.getStok() - 1);
        kitapRepository.save(kitap);

        // Odunc kaydı ekle
        Odunc odunc = new Odunc();
        odunc.setKid(kitapId);
        oduncRepository.save(odunc);

        System.out.println(kitap.getName() + " isimli kitap ödünç verilmiştir. Geriye " + kitap.getStok() + " adet kitap kalmıştır.");
    }

    @Transactional
    public void iadeEt(Long kid) {
        Kitap kitap = kitapRepository.findById(kid).orElseThrow();
        kitap.setStok(kitap.getStok() + 1);
        kitapRepository.save(kitap);

        // Odunc kaydı sil
        Odunc odunc = oduncRepository.findByKid(kid);
        oduncRepository.delete(odunc);

        System.out.println(kitap.getName() + " isimli kitap iade edilmiştir. Yeni stok miktarı: " + kitap.getStok() + " adet");
    }

    @Transactional
    public void gorevliEkle(List<Gorevli> gorevliler) {
        gorevliRepository.saveAll(gorevliler);
    }
}