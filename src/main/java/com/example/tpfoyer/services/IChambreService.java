package com.example.tpfoyer.services;

import com.example.tpfoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addOrUpdateChambre(Chambre Chambre);
    Chambre getChambre(long id);
    List<Chambre> getAllChambres();
    void deleteChambre(long id);
}
