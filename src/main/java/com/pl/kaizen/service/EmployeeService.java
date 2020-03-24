package com.pl.kaizen.service;

import com.pl.kaizen.dto.RegisterEmployeeDTO;
import com.pl.kaizen.model.entities.Employee;
import com.pl.kaizen.model.enums.Gender;
import com.pl.kaizen.model.enums.Role;
import com.pl.kaizen.model.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository, PasswordEncoder passwordEncoder) {
        this.employeeRepository = employeeRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void saveEmployee(RegisterEmployeeDTO employeeDTO) {

        Employee employee = Employee.builder()
                .firstName(employeeDTO.getFirstName())
                .lastName(employeeDTO.getLastName())
                .gender(employeeDTO.getGender())
                .email(employeeDTO.getEmail())
                .telephoneNumber(employeeDTO.getTelephoneNumber())
                .departmentId(employeeDTO.getDepartmentId())
                .role(Role.EMPLOYEE)
                .isActive(true)
                .build();

        employeeRepository.save(employee);
    }
}
