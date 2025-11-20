package com.example.tpfoyer.services;

import com.example.tpfoyer.entities.Chambre;
import com.example.tpfoyer.repositories.ChambreRepository;
import com.example.tpfoyer.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChambreServiceImpl implements IChambreService{
    @Autowired
    private ChambreRepository chambreRepository;
    @Override
    public Chambre addOrUpdateChambre(Chambre Chambre) {
        return chambreRepository.save(Chambre);
    }

    @Override
    public Chambre getChambre(long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public void deleteChambre(long id) {
chambreRepository.deleteById(id);
    }
}
