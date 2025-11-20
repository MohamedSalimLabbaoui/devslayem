package com.example.tpfoyer.services;

import com.example.tpfoyer.entities.Bloc;
import com.example.tpfoyer.repositories.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlocServiceImpl implements IBlocService{
    @Autowired
    private BlocRepository blocRepository;
    @Override
    public Bloc addOrUpdateBloc(Bloc Bloc) {
        return blocRepository.save(Bloc);
    }

    @Override
    public Bloc getBloc(long id) {
        return blocRepository.findById(id).get();
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public void deleteBloc(long id) {
blocRepository.deleteById(id);
    }
}
