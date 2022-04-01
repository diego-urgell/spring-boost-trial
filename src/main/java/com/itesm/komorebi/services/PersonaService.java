package com.itesm.komorebi.services;

import com.itesm.komorebi.models.Persona;
import com.itesm.komorebi.repositories.PersonaRepository;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import java.util.List;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public Persona cumplirAnios(Persona p){
        p.setEdad(p.getEdad()+1);
        return p;
    }

    public List<Persona> getAll(){
        return personaRepository.findAll();
    }

    public Persona getById(int id){
        return personaRepository.getById(id);
    }
}
