package com.umuzi.project;

@SuppressWarnings("serial")
public class NoSpecailCharacterException extends Exception {
	public NoSpecailCharacterException() {
		 System.out.println("Error occurred : password should have at least one special character");

	}
}
