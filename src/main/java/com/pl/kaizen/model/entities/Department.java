package com.pl.kaizen.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode (of = "id")
@Builder
@Entity
@Table(name = "departments")
public class Department extends EntityBase{

    @Column(columnDefinition = "TEXT", nullable = false )
    private String departmentName;

    @Column (name = "manager_id")
    private Long managerId;

}
