package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Dto.YazarDto;
import com.example.veritabaniodev.Entity.Kitap;
import com.example.veritabaniodev.Entity.Yazar;
import com.example.veritabaniodev.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/yazar")
public class YazarController {
    @Autowired
    private YazarService yazarService;
    private YazarServiceImpl yazarServiceImpl;

    @GetMapping("/getir")
    public ResponseEntity<List<Yazar>> getAllYazar() {
        List<Yazar> yazarList = yazarService.getAllYazar();
        return new ResponseEntity<>(yazarList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Yazar> getYazarById(@PathVariable("id") Long id) {
        Optional<Yazar> yazar = yazarService.getYazarById(id);
        return yazar.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/post")
    public ResponseEntity<Yazar> saveYazar(@RequestBody Yazar yazar) {
        Yazar savedYazar = yazarService.saveYazar(yazar);
        return new ResponseEntity<>(savedYazar, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Yazar> deleteYazar(@PathVariable("id") Long id) {
        yazarService.deleteYazar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{name}")
    public ResponseEntity<Yazar> updateYazar(@PathVariable Long id, @RequestBody Yazar yazar) {
        Yazar updatedYazar = yazarServiceImpl.updateYazar(yazar);
        return ResponseEntity.ok(updatedYazar);
    }
}
