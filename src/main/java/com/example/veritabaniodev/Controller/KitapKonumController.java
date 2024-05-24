package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Entity.Gorevli;
import com.example.veritabaniodev.Entity.KitapKonum;
import com.example.veritabaniodev.Repo.KitapKonumRepo;
import com.example.veritabaniodev.Service.KitapKonumService;
import com.example.veritabaniodev.Service.KitapKonumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/kitapkonum")
public class KitapKonumController {

    @Autowired
    private KitapKonumService kitapKonumService;
    private KitapKonumServiceImpl kitapKonumImpl;

    @GetMapping("/getir")
    public ResponseEntity<List<KitapKonum>> getAllKitapKonum() {
        List<KitapKonum> kitapKonumList = kitapKonumService.getAllKitapKonum();
        return new ResponseEntity<>(kitapKonumList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<KitapKonum> getKitapKonumById(@PathVariable Long id) {
        KitapKonum kitapKonum = kitapKonumService.getKitapKonumById(id);
        if (kitapKonum != null) {
            return new ResponseEntity<>(kitapKonum, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<KitapKonum> updateKitapKonum(@PathVariable Long id, @RequestBody KitapKonum kitapKonum) {
        KitapKonum updatedkitapKonum = kitapKonumImpl.updateKitapKonum(kitapKonum);
        return ResponseEntity.ok(updatedkitapKonum);
    }

    @PostMapping("/post")
    public ResponseEntity<KitapKonum> saveKitapKonum(@RequestBody KitapKonum kitapKonum) {
        KitapKonum savedKitapKonum = kitapKonumService.saveKitapKonum(kitapKonum);
        return new ResponseEntity<>(savedKitapKonum, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKitapKonum(@PathVariable Long id) {
        kitapKonumService.deleteKitapKonum(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}