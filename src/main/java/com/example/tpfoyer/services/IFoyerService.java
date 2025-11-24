package com.example.tpfoyer.services;

import com.example.tpfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {

    Foyer addOrUpdateFoyer(Foyer Foyer);
    Foyer getFoyer(long id);
    List<Foyer> getAllFoyers();
    void deleteFoyer(long id);
}
