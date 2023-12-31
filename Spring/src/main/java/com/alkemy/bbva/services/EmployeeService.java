package com.alkemy.bbva.services;

import com.alkemy.bbva.domain.Employee;
import com.alkemy.bbva.domain.Rol;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
    private static Set<Employee> employees = new HashSet<>();

    public EmployeeService() {
        loadEmployees();
    }

    public Set<Employee> add(Employee e) {
        employees.add(e);
        return employees;
    }

    public Employee get(int id) {
        return employees.stream().filter(empleado -> empleado.getId() == id).findFirst().orElse(null);
    }

    public Set<Employee> getAll() {
        return employees.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<Employee> delete(int id) {
        employees.removeIf(employee -> employee.getId() == id);
        return employees;
    }

    public Set<Employee> update(int id, Employee employee) throws Exception {
        Employee employeeOld = employees.stream().filter(empleado -> empleado.getId() == id).findFirst().orElse(null);
        if(Objects.isNull(employeeOld)) {
            throw new Exception("No existe el usuario");
        }

        employees.remove(employeeOld);
        employee.setId(id);
        employees.add(employee);
        return employees;
    }

    private void loadEmployees() {
        employees.add(new Employee(1, "Juan Pérez", 50000.0, Rol.ADMINISTRADOR));
        employees.add(new Employee(2, "María García", 60000.0, Rol.MODERADOR));
        employees.add(new Employee(3, "Luis Rodríguez", 55000.0));
        employees.add(new Employee(4, "Ana Fernández", 65000.0));
        employees.add(new Employee(5, "Carlos Gómez", 70000.0, Rol.ADMINISTRADOR));
        employees.add(new Employee(6, "Laura López", 52000.0));
        employees.add(new Employee(7, "Jorge González", 48000.0));
        employees.add(new Employee(8, "Valentina Martínez", 75000.0));
        employees.add(new Employee(9, "Facundo Sánchez", 57000.0));
        employees.add(new Employee(10, "Sofía Pérez", 68000.0));
        employees.add(new Employee(11, "Emilio Acosta", 53000.0));
        employees.add(new Employee(12, "Camila Romero", 58000.0));
        employees.add(new Employee(13, "Mateo Morales", 62000.0));
        employees.add(new Employee(14, "Luciana Torres", 54000.0));
        employees.add(new Employee(15, "Agustín Vargas", 71000.0));
        employees.add(new Employee(16, "Mía Molina", 50000.0));
        employees.add(new Employee(17, "Joaquín Navarro", 56000.0));
        employees.add(new Employee(18, "Martina Romero", 66000.0));
        employees.add(new Employee(19, "Lucas Herrera", 59000.0));
        employees.add(new Employee(20, "Catalina Medina", 63000.0));
        employees.add(new Employee(21, "Ignacio Ríos", 52000.0));
        employees.add(new Employee(22, "Florencia Castro", 54000.0));
        employees.add(new Employee(23, "Benjamín Ibarra", 68000.0));
        employees.add(new Employee(24, "Candela Vega", 57000.0));
        employees.add(new Employee(25, "Tomás Mendoza", 61000.0));
    }

}
