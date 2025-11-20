package com.example.tpfoyer.controllers;

import com.example.tpfoyer.entities.Etudiant;
import com.example.tpfoyer.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EtudiantController")
@AllArgsConstructor

public class EtudiantController {
IEtudiantService etudiantService;
    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addOrUpdateEtudiant(etudiant);
    }

    @PutMapping("/updateProject")
    Etudiant updateProject(@RequestBody Etudiant Etudiant) {
        return etudiantService.addOrUpdateEtudiant(Etudiant);
    }

    @DeleteMapping("/deleteEtudiant/{id}")
    void deleteEtudiant(@PathVariable long id) {
        etudiantService.deleteEtudiant(id);

    }

    @GetMapping("/listeEtudiant")
    List<Etudiant> listeEtudiant() {
        return   etudiantService.getAllEtudiants();
    }
    @GetMapping ("/Etudiant/{id}")
    Etudiant listeEtudiantById(@PathVariable long id) {
        return etudiantService.getEtudiant(id);
    }
}
