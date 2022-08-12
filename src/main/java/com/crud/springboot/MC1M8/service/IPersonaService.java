
package com.crud.springboot.MC1M8.service;

import com.crud.springboot.MC1M8.model.Persona;
import java.util.List;


//En la Inteface se declaran todos los Metodos pero nunca se implementan.
//La implementacion se realiza en PersonaService.java.

public interface IPersonaService {
    
    //Todos los Metodos CRUD.
    
    public List<Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    
}
