package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Entity.KitapKonum;
import com.example.veritabaniodev.Entity.YayineviAdres;
import com.example.veritabaniodev.Service.YayinEviAdresService;
import com.example.veritabaniodev.Service.YayineviAdresServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/yayineviAdres")
public class YayineviAdresController {

    @Autowired
    private YayinEviAdresService yayineviAdresService;
    private YayineviAdresServiceImpl yayineviAdresImpl;

    @GetMapping("/getir")
    public ResponseEntity<List<YayineviAdres>> getAllYayineviAdres() {
        List<YayineviAdres> yayineviAdresList = yayineviAdresService.getAllYayineviAdres();
        return new ResponseEntity<>(yayineviAdresList, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<YayineviAdres> updateYayinEviAdres(@PathVariable Long id, @RequestBody YayineviAdres yayineviAdres) {
        YayineviAdres updatedYayinEviAdres = yayineviAdresImpl.updateYayınEviAdres(yayineviAdres);
        return ResponseEntity.ok(updatedYayinEviAdres);
    }

    @GetMapping("/{id}")
    public ResponseEntity<YayineviAdres> getYayineviAdresById(@PathVariable("id") Long id) {
        Optional<YayineviAdres> yayineviAdres = yayineviAdresService.getYayineviAdresById(id);
        return yayineviAdres.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/post")
    public ResponseEntity<YayineviAdres> saveYayineviAdres(@RequestBody YayineviAdres yayineviAdres) {
        YayineviAdres savedYayineviAdres = yayineviAdresService.saveYayineviAdres(yayineviAdres);
        return new ResponseEntity<>(savedYayineviAdres, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteYayineviAdres(@PathVariable("id") Long id) {
        yayineviAdresService.deleteYayineviAdres(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
