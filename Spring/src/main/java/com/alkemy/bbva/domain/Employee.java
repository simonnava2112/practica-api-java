package com.alkemy.bbva.domain;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    private int id;
    private String nombre;
    private double sueldo;
    private Rol rol = Rol.USUARIO;

    public Employee(int id, String nombre, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
}

