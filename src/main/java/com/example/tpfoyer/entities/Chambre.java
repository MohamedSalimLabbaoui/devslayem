package com.example.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idChambre;
    String nomChambre;

    @Enumerated(EnumType.STRING)

    TypeChambre typeChambre;

    @ManyToOne ()
    Bloc blc;

    @OneToMany()
    Set<Reservation> reservations;
}
