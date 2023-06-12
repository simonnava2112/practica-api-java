package com.usuariosimon.usuarios.controller;

import com.usuariosimon.usuarios.bean.Persona;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practica")

public class demoController {
    @RequestMapping(value ="/person", method = RequestMethod.GET)
    public Persona getPersona(HttpServletRequest request ) {
        Persona person = new Persona();
        person.setNombre("simon");
        person.setApellido("Nava");
        person.setDni(95919798);
        return  person;
    }
}
