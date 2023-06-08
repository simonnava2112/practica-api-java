package com.alkemy.bbva.rest;

import com.alkemy.bbva.domain.Employee;
import com.alkemy.bbva.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/empleados")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/hola")
    public Set<Employee> getAll(){
        return employeeService.getAll();
    }

    @PostMapping("/")
    public Set<Employee> add(@RequestBody Employee employee){
        return employeeService.add(employee);
    }

    @DeleteMapping("/{position}")
    public Set<Employee> deleteByPosition(@PathVariable int position){
        return employeeService.delete(position);
    }
}
