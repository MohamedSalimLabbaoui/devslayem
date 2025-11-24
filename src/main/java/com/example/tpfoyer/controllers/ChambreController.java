package com.example.tpfoyer.controllers;

import com.example.tpfoyer.entities.Chambre;
import com.example.tpfoyer.services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ChambreController")
@AllArgsConstructor
public class ChambreController {
    IChambreService chambreService;
    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addOrUpdateChambre(chambre);
    }

    @PutMapping("/updateChambre")
    Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.addOrUpdateChambre(chambre);
    }

    @GetMapping("/Chambre/{id}")
Chambre listeChambre(@PathVariable int id) {
        return chambreService.getChambre(id);
    }

    @GetMapping("/listeChambre")
    List<Chambre> listeChambre() {
        return chambreService.getAllChambres();
    }
    @DeleteMapping("/deleteChambre/{id}")
void deleteChambre(@PathVariable int id) {
    chambreService.deleteChambre(id);
    }
}
