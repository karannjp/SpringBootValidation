package com.example.BeanValidationSpringBoot.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@com.example.BeanValidationSpringBoot.validation.Id
public class User {
    @Id
 @GeneratedValue

    private  int id;
    private String First_name;
    private  String last_name;


}
