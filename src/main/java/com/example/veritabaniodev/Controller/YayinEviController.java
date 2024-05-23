package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Entity.YayinEvi;
import com.example.veritabaniodev.Service.YayinEviService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/yayinEvi")
public class YayinEviController {

    @Autowired
    private YayinEviService yayinEviService;

    @GetMapping
    public ResponseEntity<List<YayinEvi>> getAllYayinEvi() {
        List<YayinEvi> yayinEviList = yayinEviService.getAllYayinEvi();
        return new ResponseEntity<>(yayinEviList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<YayinEvi> getYayinEviById(@PathVariable("id") Long id) {
        Optional<YayinEvi> yayinEvi = yayinEviService.getYayinEviById(id);
        return yayinEvi.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<YayinEvi> saveYayinEvi(@RequestBody YayinEvi yayinEvi) {
        YayinEvi savedYayinEvi = yayinEviService.saveYayinEvi(yayinEvi);
        return new ResponseEntity<>(savedYayinEvi, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteYayinEvi(@PathVariable("id") Long id) {
        yayinEviService.deleteYayinEvi(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}