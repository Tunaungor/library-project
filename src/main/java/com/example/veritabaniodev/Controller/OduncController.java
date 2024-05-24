package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Entity.KitapKonum;
import com.example.veritabaniodev.Entity.Odunc;
import com.example.veritabaniodev.Service.OduncService;
import com.example.veritabaniodev.Service.OduncServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/odunc")
public class OduncController {

    @Autowired
    private OduncService oduncService;
    private OduncServiceImpl oduncImpl;

    @GetMapping("/getir")
    public ResponseEntity<List<Odunc>> getAllOdunc() {
        List<Odunc> oduncList = oduncService.getAllOdunc();
        return new ResponseEntity<>(oduncList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Odunc> getOduncById(@PathVariable("id") Long id) {
        Optional<Odunc> odunc = oduncService.getOduncById(id);
        return odunc.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/post")
    public ResponseEntity<Odunc> saveOdunc(@RequestBody Odunc odunc) {
        Odunc savedOdunc = oduncService.saveOdunc(odunc);
        return new ResponseEntity<>(savedOdunc, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOdunc(@PathVariable("id") Long id) {
        oduncService.deleteOdunc(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Odunc> updateOdunc(@PathVariable Long id, @RequestBody Odunc odunc) {
        Odunc updatedOdunc = oduncImpl.updateOdunc(odunc);
        return ResponseEntity.ok(updatedOdunc);
    }
}
