package com.example.tpfoyer.controllers;

import com.example.tpfoyer.entities.Bloc;
import com.example.tpfoyer.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BlocController")
public class BlocController {
    @Autowired
    IBlocService blocService;
    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc bloc) {
return blocService.addOrUpdateBloc(bloc);
    }

    @PutMapping("/updateBloc")
    Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.addOrUpdateBloc(bloc);

    }

@DeleteMapping("/deleteBloc/{id}")
    void deleteBloc(@PathVariable long id) {
    blocService.deleteBloc(id);
}

@GetMapping("/listeBloc")
List<Bloc> listeBloc() {
        return blocService.getAllBlocs();
}

@GetMapping("/bloc/{id}")
    Bloc getBloc(@PathVariable long id) {
        return blocService.getBloc(id);
    }
}
