package br.com.kelvyn.sistemacadastro.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.kelvyn.sistemacadastro.database.model.Aircraft;
import br.com.kelvyn.sistemacadastro.database.repository.AircraftRepository;
import lombok.*;

@Service 
@RequiredArgsConstructor
public class AircraftService {
    private final AircraftRepository aircraftRepository;

    public void deleteAircraft(String id){
        aircraftRepository.deleteById(id);
    }

    public List<Aircraft> listAllAircraft(){
        return aircraftRepository.findAll();
    }

    public Aircraft createAircraft(Aircraft aircraft){
        return aircraftRepository.save(aircraft);
    }

    public Optional<Aircraft> findAircraft(String id){
        return aircraftRepository.findById(id);
    }
}
