package com.itesm.komorebi.repositories;

import com.itesm.komorebi.models.Persona;
import org.springframework.stereotype.Repository;import java.util.ArrayList;import java.util.List;

@Repository
public class PersonaRepository {
    public List<Persona> findAll(){
        Persona p1 = new Persona();
        p1.setNombre("Juan");
        p1.setEdad(33);
        Persona p2 = new Persona();
        p2.setNombre("Andres");
        p2.setEdad(32);
        List<Persona> result = new ArrayList<>();
        result.add(p1);
        result.add(p2);
        return result;
    }

    public Persona getById(int id){
        if (id == 1){
            return new Persona("Diego", 20);
        } else if (id == 2){
            return new Persona("Alex", 23);
        } else{
            return null;
        }
    }

}
