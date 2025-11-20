package com.example.tpfoyer.controllers;

import com.example.tpfoyer.entities.Foyer;
import com.example.tpfoyer.services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FoyerController")
@AllArgsConstructor
public class FoyerController {
    IFoyerService FoyerService;
    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer Foyer) {
        return FoyerService.addOrUpdateFoyer(Foyer);
    }

    @PutMapping("/updateProject")
    Foyer updateProject(@RequestBody Foyer Foyer) {
        return FoyerService.addOrUpdateFoyer(Foyer);
    }

    @DeleteMapping("/deleteFoyer/{id}")
    void deleteFoyer(@PathVariable long id) {
        FoyerService.deleteFoyer(id);

    }

    @GetMapping("/listeFoyer")
    List<Foyer> listeFoyer() {
        return   FoyerService.getAllFoyers();
    }
    @GetMapping ("/Foyer/{id}")
    Foyer listeFoyerById(@PathVariable long id) {
        return FoyerService.getFoyer(id);
    }
}
