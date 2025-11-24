package com.example.tpfoyer.services;

import com.example.tpfoyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addOrUpdateEtudiant(Etudiant Etudiant);
    Etudiant getEtudiant(long id);
    List<Etudiant> getAllEtudiants();
    void deleteEtudiant(long id);
}
