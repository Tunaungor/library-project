package com.example.veritabaniodev.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "KitapKonum")
public class KitapKonum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long katNo;

    private String OdaNo;

    private String RafNo;


}
