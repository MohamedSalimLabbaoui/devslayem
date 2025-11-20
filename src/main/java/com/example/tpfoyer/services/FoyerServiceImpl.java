package com.example.tpfoyer.services;

import com.example.tpfoyer.entities.Foyer;
import com.example.tpfoyer.repositories.FoyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoyerServiceImpl implements IFoyerService {

    @Autowired
    private FoyerRepository foyerRepository;
    @Override
    public Foyer addOrUpdateFoyer(Foyer Foyer) {
        return foyerRepository.save(Foyer);
    }

    @Override
    public Foyer getFoyer(long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public void deleteFoyer(long id) {
    foyerRepository.deleteById(id);
    }
}
