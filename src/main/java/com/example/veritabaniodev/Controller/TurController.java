package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Entity.Tur;
import com.example.veritabaniodev.Service.TurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tur")
public class TurController {

    @Autowired
    private TurService turService;

    @GetMapping
    public ResponseEntity<List<Tur>> getAllTur() {
        List<Tur> turList = turService.getAllTur();
        return new ResponseEntity<>(turList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tur> getTurById(@PathVariable("id") Long id) {
        Optional<Tur> tur = turService.getTurById(id);
        return tur.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Tur> saveTur(@RequestBody Tur tur) {
        Tur savedTur = turService.saveTur(tur);
        return new ResponseEntity<>(savedTur, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTur(@PathVariable("id") Long id) {
        turService.deleteTur(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}