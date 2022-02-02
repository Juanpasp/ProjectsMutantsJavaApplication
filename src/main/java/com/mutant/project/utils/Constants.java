package com.mutant.project.utils;

public class Constants {
	
	private Constants() {
	    throw new IllegalStateException("Constants class");
	}

	public static final String MESSAGE_VALIDATION_CHARACTERS = "Solamente se permite los caracteres A, T, C, G. Por favor revise y vuelva ingresar la información";
	public static final String MESSAGE_RESULT_MUTANT = "El resultado del adn verificado es de mutante";
	public static final String MESSAGE_RESULT_HUMAN = "El resultado del adn verificado es de humano";
	public static final Integer COUNT_OCURRENCES_VALID = 1; 
	public static final Integer COUNT_CHARACTERS_CONSECUTIVES_VALID = 4;
	public static final Integer VALUE_INITIAL_COINCIDENT = 2;
	
	
}
