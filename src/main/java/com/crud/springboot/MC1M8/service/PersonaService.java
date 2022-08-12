
package com.crud.springboot.MC1M8.service;

import com.crud.springboot.MC1M8.model.Persona;
import com.crud.springboot.MC1M8.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService {
    
    //@Autowired nos permite hacer inyeccion de dependencias entre una y otra  clase.
    //Tal un Constructor o Getter/Setter pero sin tener que crear tanto "new" por cada asunto.
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll(); //findAll() es un metodo proporsionado por Hibernete.
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per); //save() crea una persona de no haber ninguna con el mismo Id, y de haberla, la modifica).
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
        //Sino encuentra la persona, devuelve Null.
    }
    
}
