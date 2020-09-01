package com.umuzi.project;

@SuppressWarnings("serial")
public class NoLowerCaseException extends Exception {
	 public NoLowerCaseException(){
	        System.out.println("Error occurred : password should have at least one lowercase letter");
	    }
}
