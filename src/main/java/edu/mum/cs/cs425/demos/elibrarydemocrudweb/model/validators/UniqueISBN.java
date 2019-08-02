package edu.mum.cs.cs425.demos.elibrarydemocrudweb.model.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueISBNValidator.class)

public @interface UniqueISBN {
String message() default "{edu.mum.cs.cs425.customvalidator.uniqueisbn.message}";
	
}
