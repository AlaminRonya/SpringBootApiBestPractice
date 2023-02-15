package com.alamin.exceptionhandlingglobal.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;


public class NullValidImpl implements ConstraintValidator<NullValid, String> {

    @Override
    public void initialize(NullValid constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value.equals("")|| StringUtils.isEmpty(value.trim())) {
            return false;
        }

        return true;
    }

}