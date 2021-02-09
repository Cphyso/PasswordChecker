package com.umuzi.project;

@SuppressWarnings("serial")
public class NoSpecialCharacterException extends Exception {
	public NoSpecialCharacterException() {
		 System.out.println("Error occurred : password should have at least one special character");

	}
}
