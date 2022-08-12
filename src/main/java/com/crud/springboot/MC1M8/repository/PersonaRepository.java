
package com.crud.springboot.MC1M8.repository;

import com.crud.springboot.MC1M8.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository<Objeto a Persistir, Tipo de dato del ID de esa clase a Persistir>

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
