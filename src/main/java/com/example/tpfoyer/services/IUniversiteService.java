package com.example.tpfoyer.services;

import com.example.tpfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addOrUpdateUniversite(Universite Universite);
    Universite getUniversite(long id);
    List<Universite> getAllUniversites();
    void deleteUniversite(long id);
}
