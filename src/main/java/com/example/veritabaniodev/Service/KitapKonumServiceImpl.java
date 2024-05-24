package com.example.veritabaniodev.Service;


import com.example.veritabaniodev.Entity.Gorevli;
import com.example.veritabaniodev.Entity.KitapKonum;
import com.example.veritabaniodev.Entity.User;
import com.example.veritabaniodev.Repo.KitapKonumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KitapKonumServiceImpl implements KitapKonumService {

//    @Autowired
//    private KitapKonumRepo kitapKonumRepository;
//
//    public List<KitapKonum> getAllKitapKonum() {
//        return kitapKonumRepository.findAll();
//    }
//
//    public Optional<KitapKonum> getKitapKonumById(Long id) {
//        return kitapKonumRepository.findById(id);
//    }
////    public KitapKonum getKitapKonumById(KitapKonum kitapKonum) {
////        return kitapKonumRepository.save(kitapKonum);
////    }
//
//    public KitapKonum saveKitapKonum(KitapKonum kitapKonum) {
//        return kitapKonumRepository.save(kitapKonum);
//    }
//
//    public void deleteKitapKonum(Long id) {
//        kitapKonumRepository.deleteById(id);
//    }
//
//    public void addKitapKonum(List<KitapKonum> kitapKonumList) {
//        kitapKonumRepository.saveAll(kitapKonumList);
//    }
//}
//@Service
//public class KitapKonumServiceImpl implements KitapKonumService {

    @Autowired
    private KitapKonumRepo kitapKonumRepository;

    @Override
    public List<KitapKonum> getAllKitapKonum() {
        return kitapKonumRepository.findAll();
    }

    @Override
    public KitapKonum getKitapKonumById(Long id) {
        return kitapKonumRepository.findById(id).orElse(null);
    }

    @Override
    public KitapKonum saveKitapKonum(KitapKonum kitapKonum) {
        return kitapKonumRepository.save(kitapKonum);
    }

    @Override
    public void deleteKitapKonum(Long id) {
        kitapKonumRepository.deleteById(id);
    }
    public KitapKonum updateKitapKonum(KitapKonum kitapKonum) {
        return kitapKonumRepository.save(kitapKonum);
    }


}

