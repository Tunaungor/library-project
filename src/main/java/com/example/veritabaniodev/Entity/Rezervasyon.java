package com.example.veritabaniodev.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "Rezervasyon")
public class Rezervasyon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date alistarihi;

    @OneToOne
    @JoinColumn(name = "kitap_id", nullable = false, unique = true)
    private Kitap kitap;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
