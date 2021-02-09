package com.umuzi.project;
/**
 * author: Sifiso Mhlongo
 * Description: PasswordChecker class checks against 6 conditions 
 * 
 * */


import java.util.logging.Logger;

public class PasswordChecker {
	
	final Logger classLogger = Logger.getLogger(PasswordChecker.class.getName());
	/**
	 * defining regular expression pattern to check password
	 * */
    static String checkDigits = ".*\\d+.*";
    static String checkLowerCase = ".*[a-z]+.*";
    static String checkUpperCase = ".*[A-Z]+.*";
    static String checkSpecialChar = ".*[^a-zA-Z0-9].*";
    
    public void printPasswordNotOkay() {
    	System.out.println("The password is neverOK if condition 1 and 2 are not met*");
    }
/**
 * method validates 6 different condition, if any isn't met an Exception is thrown
 * */
    public void passwordIsValid(String password)throws Exception{
        if(password.isEmpty()){
        	printPasswordNotOkay();
            throw new Exception("password should exist");
        }else if(password.length() < 8){
        	printPasswordNotOkay();
            throw new Exception("password should be longer than than 8 characters");
        }else if(!password.matches(checkLowerCase)){
            throw new NoLowerCaseException();
        }else if(!password.matches(checkUpperCase)){
            throw new NoUpperCaseException();
        }else if(!password.matches(checkDigits)){
            throw new NoDigitException();
		}else if(!password.matches(checkSpecialChar)){
			throw new NoSpecialCharacterException(); }

    }
 /**
  * method counts the number of conditions passed by passwordIsValid method
  * */
    public boolean passwordIsOkay(String password){
    	final byte minimumNumberForPass = 3;
        byte counter = 0;
        if(!password.isEmpty()) {counter++;}
        if(!(password.length() < 8)) {counter++;}
        if(password.matches(checkLowerCase)) {counter++;}
        if(password.matches(checkUpperCase)) {counter++;}
        if(password.matches(checkDigits)) {counter++;}
		if(password.matches(checkSpecialChar)) {counter++;}

        if(counter < minimumNumberForPass){
            return false;
        }else {
            return true;
        }
    }
}

