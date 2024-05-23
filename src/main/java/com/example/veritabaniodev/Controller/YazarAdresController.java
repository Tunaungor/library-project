package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Entity.YazarAdres;
import com.example.veritabaniodev.Service.YazarAdresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/yazarAdres")
public class YazarAdresController {

    @Autowired
    private YazarAdresService yazarAdresService;

    @GetMapping
    public ResponseEntity<List<YazarAdres>> getAllYazarAdres() {
        List<YazarAdres> yazarAdresList = yazarAdresService.getAllYazarAdres();
        return new ResponseEntity<>(yazarAdresList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<YazarAdres> getYazarAdresById(@PathVariable("id") Long id) {
        Optional<YazarAdres> yazarAdres = yazarAdresService.getYazarAdresById(id);
        return yazarAdres.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<YazarAdres> saveYazarAdres(@RequestBody YazarAdres yazarAdres) {
        YazarAdres savedYazarAdres = yazarAdresService.saveYazarAdres(yazarAdres);
        return new ResponseEntity<>(savedYazarAdres, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteYazarAdres(@PathVariable("id") Long id) {
        yazarAdresService.deleteYazarAdres(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
