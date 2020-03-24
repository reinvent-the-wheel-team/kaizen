package com.pl.kaizen.dto;

import com.pl.kaizen.model.enums.Gender;
import com.pl.kaizen.model.enums.Role;
import lombok.Data;

import javax.persistence.Column;

@Data
public class RegisterEmployeeDTO {

    private String firstName;
    private String lastName;
    private Gender gender;
    private String email;
    private String telephoneNumber;
    private Long departmentId;
    private Role role;
    private Boolean isActive;

}
