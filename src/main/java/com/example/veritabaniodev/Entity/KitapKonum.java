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
@Table(name = "KitapKonum")
public class KitapKonum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true)
    private Long id;

    private Long katNo;

    private Long OdaNo;

    private Long RafNo;


    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "kitap_konum_id")
    private Kitap kitap;
}

