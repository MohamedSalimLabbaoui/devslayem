package com.example.tpfoyer.services;

import com.example.tpfoyer.entities.Universite;
import com.example.tpfoyer.repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversiteServiceImpl implements IUniversiteService{
    @Autowired
    private UniversiteRepository universiteRepository;
    @Override
    public Universite addOrUpdateUniversite(Universite Universite) {
        return universiteRepository.save(Universite);
    }

    @Override
    public Universite getUniversite(long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public void deleteUniversite(long id) {
universiteRepository.deleteById(id);
    }
}
