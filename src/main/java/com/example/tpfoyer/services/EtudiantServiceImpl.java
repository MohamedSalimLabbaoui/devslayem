package com.example.tpfoyer.services;

import com.example.tpfoyer.entities.Etudiant;
import com.example.tpfoyer.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EtudiantServiceImpl implements IEtudiantService{
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addOrUpdateEtudiant(Etudiant Etudiant) {
        return etudiantRepository.save(Etudiant);
    }

    @Override
    public Etudiant getEtudiant(long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public void deleteEtudiant(long id) {
etudiantRepository.deleteById(id);
    }
}
