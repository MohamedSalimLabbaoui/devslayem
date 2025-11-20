package com.example.tpfoyer.services;

import com.example.tpfoyer.entities.Bloc;

import java.util.List;

public interface IBlocService {

    Bloc addOrUpdateBloc(Bloc Bloc);
    Bloc getBloc(long id);
    List<Bloc> getAllBlocs();
    void deleteBloc(long id);
}

