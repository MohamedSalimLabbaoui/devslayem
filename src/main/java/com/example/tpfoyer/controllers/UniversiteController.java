package com.example.tpfoyer.controllers;

import com.example.tpfoyer.entities.Reservation;
import com.example.tpfoyer.entities.Universite;
import com.example.tpfoyer.services.IReservationService;
import com.example.tpfoyer.services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ReservationController")
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService universiteService;

    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite Universite) {
        return universiteService.addOrUpdateUniversite(Universite);
    }

    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite Universite) {
        return universiteService.addOrUpdateUniversite(Universite);
    }

    @DeleteMapping("/deleteUniversite/{id}")
    void deleteUniversite(@PathVariable long id) {
        universiteService.deleteUniversite(id);

    }

    @GetMapping("/listeUniversite")
    List<Universite> listeUniversite() {
        return   universiteService.getAllUniversites();
    }
    @GetMapping ("/Universite/{id}")
    Universite listeUniversiteById(@PathVariable long id) {
        return universiteService.getUniversite(id);
    }
}
