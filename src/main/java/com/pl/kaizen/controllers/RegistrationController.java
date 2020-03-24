package com.pl.kaizen.controllers;

import com.pl.kaizen.dto.RegisterEmployeeDTO;
import com.pl.kaizen.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/register")
public class RegistrationController {

    private final EmployeeService employeeService;

    @Autowired
    public RegistrationController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping
    public String prepareRegistrationPage() {
        return "register-form";
    }

    @PostMapping
    public String processRegistrationPage(RegisterEmployeeDTO employeeDTO) {
        try {
            employeeService.saveEmployee(employeeDTO);

        } catch (RuntimeException d) {
            d.printStackTrace();
            return "redirect:/register";
        }
        return "login-page";
    }

}
