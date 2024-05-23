package com.example.veritabaniodev.Controller;

import com.example.veritabaniodev.Entity.UserAdres;
import com.example.veritabaniodev.Service.UserAdresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/userAdres")
public class UserAdresController {

    @Autowired
    private UserAdresService userAdresService;

    @GetMapping
    public ResponseEntity<List<UserAdres>> getAllUserAdres() {
        List<UserAdres> userAdresList = userAdresService.getAllUserAdres();
        return new ResponseEntity<>(userAdresList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserAdres> getUserAdresById(@PathVariable("id") Long id) {
        Optional<UserAdres> userAdres = userAdresService.getUserAdresById(id);
        return userAdres.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<UserAdres> saveUserAdres(@RequestBody UserAdres userAdres) {
        UserAdres savedUserAdres = userAdresService.saveUserAdres(userAdres);
        return new ResponseEntity<>(savedUserAdres, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserAdres(@PathVariable("id") Long id) {
        userAdresService.deleteUserAdres(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
