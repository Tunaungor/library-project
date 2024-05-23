package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Entity.Rezervasyon;
import com.example.veritabaniodev.Service.RezervasyonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rezervasyon")
public class RezervasyonController {

    @Autowired
    private RezervasyonService rezervasyonService;

    @GetMapping
    public ResponseEntity<List<Rezervasyon>> getAllRezervasyon() {
        List<Rezervasyon> rezervasyonList = rezervasyonService.getAllRezervasyon();
        return new ResponseEntity<>(rezervasyonList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rezervasyon> getRezervasyonById(@PathVariable("id") Long id) {
        Optional<Rezervasyon> rezervasyon = rezervasyonService.getRezervasyonById(id);
        return rezervasyon.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Rezervasyon> saveRezervasyon(@RequestBody Rezervasyon rezervasyon) {
        Rezervasyon savedRezervasyon = rezervasyonService.saveRezervasyon(rezervasyon);
        return new ResponseEntity<>(savedRezervasyon, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRezervasyon(@PathVariable("id") Long id) {
        rezervasyonService.deleteRezervasyon(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}