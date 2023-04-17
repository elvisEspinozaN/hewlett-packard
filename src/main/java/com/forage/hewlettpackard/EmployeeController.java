package com.forage.hewlettpackard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public Employees getAllEmployees() {
        return new Employees();
    }
}
