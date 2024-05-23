package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Entity.KitapKonum;
import com.example.veritabaniodev.Service.KitapKonumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/kitapkonum")
public class KitapKonumController {

    @Autowired
    private KitapKonumService kitapKonumService;

    @GetMapping
    public ResponseEntity<List<KitapKonum>> getAllKitapKonum() {
        List<KitapKonum> kitapKonumList = kitapKonumService.getAllKitapKonum();
        return new ResponseEntity<>(kitapKonumList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<KitapKonum> getKitapKonumById(@PathVariable("id") Long id) {
        Optional<KitapKonum> kitapKonum = kitapKonumService.getKitapKonumById(id);
        return kitapKonum.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<KitapKonum> saveKitapKonum(@RequestBody KitapKonum kitapKonum) {
        KitapKonum savedKitapKonum = kitapKonumService.saveKitapKonum(kitapKonum);
        return new ResponseEntity<>(savedKitapKonum, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<KitapKonum> updateKitapKonum(@PathVariable("id") Long id, @RequestBody KitapKonum kitapKonum) {
        Optional<KitapKonum> existingKitapKonum = kitapKonumService.getKitapKonumById(id);
        if (existingKitapKonum.isPresent()) {
            KitapKonum updatedKitapKonum = kitapKonumService.saveKitapKonum(kitapKonum);
            return new ResponseEntity<>(updatedKitapKonum, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteKitapKonum(@PathVariable("id") Long id) {
        kitapKonumService.deleteKitapKonum(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
