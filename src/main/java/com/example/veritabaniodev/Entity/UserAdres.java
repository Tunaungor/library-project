package com.example.veritabaniodev.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "UserAdres")
public class UserAdres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true)
    private Long UserliAdresId;

    private String mahalle;

    private String sokak;

    private String sehir;

    private String apartman;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
