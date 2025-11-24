package com.example.tpfoyer.controllers;

import com.example.tpfoyer.entities.Reservation;
import com.example.tpfoyer.services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ReservationController")
@AllArgsConstructor
public class ReservationController {
    IReservationService ReservationService;
    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation Reservation) {
        return ReservationService.addOrUpdateReservation(Reservation);
    }

    @PutMapping("/updateReservation")
    Reservation updateReservation(@RequestBody Reservation Reservation) {
        return ReservationService.addOrUpdateReservation(Reservation);
    }

    @DeleteMapping("/deleteReservation/{id}")
    void deleteReservation(@PathVariable String id) {
        ReservationService.deleteReservation(id);

    }

    @GetMapping("/listeReservation")
    List<Reservation> listeReservation() {
        return   ReservationService.getAllReservations();
    }
    @GetMapping ("/Reservation/{id}")
    Reservation listeReservationById(@PathVariable String id) {
        return ReservationService.getReservation(id);
    }
}
