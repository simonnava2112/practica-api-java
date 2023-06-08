package com.alkemy.bbva.rest;

import com.alkemy.bbva.domain.Employee;
import com.alkemy.bbva.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/empleados")
public class EmployeeController {

    @Autowired
    @Qualifier("employeeService")
    private EmployeeService employeeService;

    @GetMapping
    public Set<Employee> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable int id){
        return employeeService.get(id);
    }

    @PostMapping
    public Set<Employee> add(@RequestBody Employee employee){
        return employeeService.add(employee);
    }

    @PutMapping("/{id}")
    public Set<Employee> update(@PathVariable int id, @RequestBody Employee employee) throws Exception { return employeeService.update(id, employee); }

    @DeleteMapping("/{id}")
    public Set<Employee> deleteByPosition(@PathVariable int id){
        return employeeService.delete(id);
    }
}
