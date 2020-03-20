package com.pl.kaizen.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id") @ToString (exclude = {"password"})
@Builder
@Entity
@Table(name="task_categories")
public class Category extends EntityBase {

    @Column (name = "cat_name")
    private String categoryName;
}
