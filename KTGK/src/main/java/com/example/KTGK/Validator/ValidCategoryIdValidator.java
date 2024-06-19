package com.example.KTGK.Validator;
import com.example.KTGK.entity.PhongBan;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<com.example.KTGK.Validator.annotation.ValidCategoryId, PhongBan> {
    public boolean isValid(PhongBan phongban, ConstraintValidatorContext context){
        return phongban != null && phongban.getId() != null;
    }

}