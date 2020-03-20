package com.pl.kaizen.model.repositories;

import com.pl.kaizen.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
