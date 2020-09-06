package com.umuzi.project;
/**
 * author: Sifiso Mhlongo
 * Description: PasswordChecker class checks against 6 conditions 
 * 
 * */

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PasswordChecker {
	
	final static Logger classLogger = Logger.getLogger(PasswordChecker.class.getName());
	/**
	 * defining regular expression pattern to check password
	 * */
    static String checkDigits = ".*\\d+.*";
    static String checkLowerCase = ".*[a-z]+.*";
    static String checkUpperCase = ".*[A-Z]+.*";
    static String checkSpecailChar = "[^\\w\\s]";
    
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
		}else if(!password.matches(checkSpecailChar)){ 
			throw new NoSpecailCharacterException(); }
			 
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
		if(password.matches(checkSpecailChar)) {counter++;} 

        if(counter < minimumNumberForPass){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args)throws Exception {
    	
        String password = "QWEdfgRTYU";
        PasswordChecker example = new PasswordChecker();
        try{
        	FileHandler fileHandler = new FileHandler(".\\errors.log");
        	classLogger.addHandler(fileHandler);
        	fileHandler.setLevel(Level.INFO);
            example.passwordIsValid(password);
        }catch (NoLowerCaseException e){
        	classLogger.log(Level.INFO,"NoLowerCaseException has occurred",e);
            e.printStackTrace();
        }catch (NoUpperCaseException f){
        	classLogger.log(Level.INFO,"NoUpperCaseException has occurred",f);
            f.printStackTrace();
        }catch (NoDigitException d){
        	classLogger.log(Level.INFO,"NoDigitException has occurred",d);
            d.printStackTrace();
        }catch (NoSpecailCharacterException s){
        	classLogger.log(Level.INFO,"NoSpecailCaseException has occurred",s);
            s.printStackTrace();
        }finally {
            System.out.println(example.passwordIsOkay(password));
        }
    }
}

