package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Entity.Gorevli;
import com.example.veritabaniodev.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @PostMapping("/oduncVer/{kitapId}")
    public void oduncVer(@PathVariable Long kitapId) {
        libraryService.oduncVer(kitapId);
    }

    @PostMapping("/iadeEt/{kitapId}")
    public void iadeEt(@PathVariable Long kitapId) {
        libraryService.iadeEt(kitapId);
    }

    @PostMapping("/gorevliEkle")
    public void gorevliEkle(@RequestBody List<Gorevli> gorevliler) {
        libraryService.gorevliEkle(gorevliler);
    }
}