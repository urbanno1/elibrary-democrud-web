package edu.mum.cs.cs425.demos.elibrarydemocrudweb.model.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.cs.cs425.demos.elibrarydemocrudweb.repository.BookRepository;

public class UniqueISBNValidator implements ConstraintValidator<UniqueISBN, String> {

	
	private BookRepository repository;
	@Autowired
	public UniqueISBNValidator(BookRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public boolean isValid(String isbn, ConstraintValidatorContext context) {
		
		return false;
	}
 
}
