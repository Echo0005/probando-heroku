
package com.crud.springboot.MC1M8.controller;

import com.crud.springboot.MC1M8.model.Persona;
import com.crud.springboot.MC1M8.service.IPersonaService;
//import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    
    //La siguiente lista sera usado de Base de Datos temporal.
    //Lista, Collection.
    //List<Persona> listaPersonas = new ArrayList();
    
    ////
    //@GetMapping hara uso de tal funcion (clase) cuando la Sesion
    //en el navegador se situe sobre la URL especificada y utilizando
    //un metodo GET (los navegadores automaticamente usan GET por defecto).
    ////
    
    //Como parametro en nuestra Clase:
    
        //@PathVariable: "/hola/nombre/apellido/edad"
        //              "/hola/Delta/One/indefinido"

        //@RequesteParam: "/hola?nombre=Delta&apellido=One&edad=indefinido"
    
    
    
    //Parametros para JSON.
        //@RequestBody: recive datos en el Cuerpo del JSON.
        //@ResponseBody: envia datos en el Cuerpo del JSON.
    
    
    
    //En la URL para usarlo: localhost:8080/hola/Testing/Apellido/500
    /*
    @GetMapping ("/hola/{nombre}/{apellido}/{edad}")
    public String decirHola(@PathVariable String nombre,
                            @PathVariable String apellido,
                            @PathVariable int edad){
        return "Hola mundo. Nombre: " + nombre + ". Apellido: " + 
                apellido + ". Edad: " + edad + ".";
    }
    
    @GetMapping ("/chau")
    //RequestParam utiliza el sistema "/hola?parametro=valor" en la URL.
    public String decirChau (@RequestParam String nombre,
                             @RequestParam String apellido,
                             @RequestParam int edad){
        return "Chau mundo. Nombre: " + nombre + ". Apellido: " +
                apellido + ". Edad: " + edad + ".";
    }
    */
    
    
    ///
    //Endpoints.
    //Metódo para Crear una nueva Persona.
    @PostMapping ("/new/persona")
    //@RequestBody envia a la persona (pers) en el Body de un JSON.
    public void agregarPersona (@RequestBody Persona pers) {
        //listaPersonas.add(pers);
        persoServ.crearPersona(pers);
    }
 
    
    
    //Metódo para mostrar la Lista de Personas.
    //La cual actuara cuando estemos en ".../ver/personas" en la URL.
    @GetMapping ("/ver/personas")
    @ResponseBody //Esta funcion a continuacion, Devolvera la lista de personas
    //              y @ResponseBody tomara esa lista del return para pasarla
    //              en el Body del JSON.
    public List<Persona> verPersonas () {
        //return listaPersonas;
        return persoServ.verPersonas();
    }
    
    
    
    //Metódo para borrar una persona en la Tabla.
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    
    
    @PutMapping ("/modificar")
    public void modificarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    ///
}
