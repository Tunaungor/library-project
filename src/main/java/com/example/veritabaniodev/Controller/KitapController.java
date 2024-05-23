package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Entity.Kitap;
import com.example.veritabaniodev.Service.KitapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/kitap")
public class KitapController {

    @Autowired
    private KitapService kitapService;

    @GetMapping
    public ResponseEntity<List<Kitap>> getAllKitap() {
        List<Kitap> kitapList = kitapService.getAllKitap();
        return new ResponseEntity<>(kitapList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Kitap> getKitapById(@PathVariable("id") Long id) {
        Optional<Kitap> kitap = kitapService.getKitapById(id);
        return kitap.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Kitap> saveKitap(@RequestBody Kitap kitap) {
        Kitap savedKitap = kitapService.saveKitap(kitap);
        return new ResponseEntity<>(savedKitap, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteKitap(@PathVariable("id") Long id) {
        kitapService.deleteKitap(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}