package com.example.BeanValidationSpringBoot.validation;

import com.example.BeanValidationSpringBoot.model.User;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdValidator implements ConstraintValidator<Id, User> {
    @Override
    public void initialize(Id constraintAnnotation) {
    }

    @Override
    public boolean isValid(User value, ConstraintValidatorContext context) {
       int id1= value.getId();
        return id1==value.getId();
    }
}
