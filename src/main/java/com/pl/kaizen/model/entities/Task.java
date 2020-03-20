package com.pl.kaizen.model.entities;

import com.pl.kaizen.model.enums.State;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode (of = "id")
@Builder
@Entity
@Table(name = "tasks")
public class Task extends EntityBase {

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Boolean isActive;
    private String status;
    private LocalDate startDate;
    private LocalDate deadline;
    private State state;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "employee_id", insertable = false, updatable = false)
    private Long employeeId;

}
