package com.pl.kaizen.model.entities;

import com.pl.kaizen.model.enums.Gender;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id") @ToString (exclude = {"password"})
@Builder
@Entity
@Table(name="employees")
public class Employee extends EntityBase {

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private Gender gender;

    @Column(nullable = false)
    private String email;

    @Column(name = "tel_no")
    private String telephoneNumber;

    @Column(nullable = false)
    private String role;

    @Column
    private Boolean isActive;

    @OneToMany(mappedBy = "employee")
    private List<Task> tasks;





}
