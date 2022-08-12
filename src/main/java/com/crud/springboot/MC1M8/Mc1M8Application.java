package com.crud.springboot.MC1M8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mc1M8Application {

	public static void main(String[] args) {
		SpringApplication.run(Mc1M8Application.class, args);
	}
        
////////////////
//Index del proyecto.
//////////
        
//Method GET.
//Utilizado para solicitar datos. Traer datos de una base de
//datos.
       
//Method POST.
//Utilizado para crear, dar de alta, datos. Subir datos a la
//base de datos.
        
        
    //Packages:
        
        //Controller:
        
            //Contiene las operaciones a realizar segun la URL de la sesion
            //del navegador.

            //Operaciones GET y POST.
        
        
        //Model:
    
            //Van todas las Clases que vamos a utilizar en nuestro proyecto.
        
        
        //Repository:
        
            //Operaciones JPA.
            //Inteface que Extiende los Metodos CRUD de JpaRepository de Spring Boot.
        
        
        //Service:
        
            //Logica de "negocio".
        
            //PersonaService.java va a tener la implementacion de todo los metodos
            //declarados en IPersonaService.java.
        
            //Operaciones CRUD a la Tabla en la Base de Datos.
        
        
    //Capa DTO, Data Transfer Object. Utilizada para crear Objetos
    //especiales para dar datos de mas de una clase en un solo objeto.
}
