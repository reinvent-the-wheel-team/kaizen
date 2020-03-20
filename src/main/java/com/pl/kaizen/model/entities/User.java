package com.pl.kaizen.model.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode(of = "id") @ToString (exclude = {"password"})
@Builder
@Entity
@Table(name="users")
public class User extends EntityBase  {

}
