package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Dto.GorevliGirisDTO;
import com.example.veritabaniodev.Entity.Gorevli;
import com.example.veritabaniodev.Service.GorevliServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gorevli")
public class GorevliController {

    @Autowired
    private GorevliServiceImpl gorevliServiceImpl;

    @GetMapping("/{id}")
    public ResponseEntity<Gorevli> getGorevliById(@PathVariable Long id) {
        Gorevli gorevli = gorevliServiceImpl.getGorevliById(id);
        if (gorevli != null) {
            return ResponseEntity.ok(gorevli);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteGorevliById(@PathVariable Long id) {
        gorevliServiceImpl.deleteGorevliById(id);
        return ResponseEntity.ok("Görevli başarıyla silindi.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gorevli> updateGorevli(@PathVariable Long id, @RequestBody Gorevli gorevli) {
        Gorevli updatedGorevli = gorevliServiceImpl.updateGorevli(gorevli);
        return ResponseEntity.ok(updatedGorevli);
    }

    @PostMapping("/giris")
    public ResponseEntity<String> girisYap(@RequestBody GorevliGirisDTO gorevli) {
        boolean girisBasarili = gorevliServiceImpl.girisYap(gorevli.getKullaniciAdi(), gorevli.getSifre());
        if (girisBasarili) {
            return ResponseEntity.ok("Giriş başarılı.");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Kullanıcı adı veya şifre yanlış.");
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Gorevli> createGorevli(@RequestBody Gorevli gorevli) {
        Gorevli savedGorevli = gorevliServiceImpl.saveOrUpdateGorevli(gorevli);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedGorevli);
    }
}
