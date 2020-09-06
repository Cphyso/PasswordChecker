/**
 * 
 */
package com.umuzi.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Sifiso Mhlongo
 *
 */
class PasswordCheckerTest {
	/**
	 * Test asserts NoDigit exception works
	 * */
	@Test
	void passwordIsValidTest_NoDigitExceptionIsThrown() {
		PasswordChecker password = new PasswordChecker();
		Exception exception = assertThrows(NoDigitException.class, () ->{
			password.passwordIsValid("qwertyu@QWERT");
		});
		
	}
	/**
	 * Test asserts NoLowerCase exception works
	 * */
	@Test
	void passwordIsValidTest_NoLowerCaseExceptionIsThrown() {
		PasswordChecker password = new PasswordChecker();
		Exception exception = assertThrows(NoLowerCaseException.class, () ->{
			password.passwordIsValid("QWERT@QWERT123");
		});
		
	}
	/**
	 * Test asserts NoUpperCase exception is working
	 * */
	@Test
	void passwordIsValidTest_NoUpperCaseExceptionIsThrown() {
		PasswordChecker password = new PasswordChecker();
		Exception exception = assertThrows(NoUpperCaseException.class, () ->{
			password.passwordIsValid("qwertyu@1234");
		});
		
	}
	/**
	 * Test asserts NoSpecailChar exceptionn is functioning
	 * */
	@Test
	void passwordIsValidTest_NoSpecailCharacterExceptionIsThrown() {
		PasswordChecker password = new PasswordChecker();
		Exception exception = assertThrows(NoSpecailCharacterException.class, () ->{
			password.passwordIsValid("qwertyu123QWERT");
		});
		
	}
	/**
	 * Test asserts exception is thrown if password is empty
	 * */
	@Test
	void emptyPassswordTest_ExceptionIsThrown() {
		PasswordChecker password = new PasswordChecker();
		Exception exception = assertThrows(Exception.class, () ->{
			password.passwordIsValid("");
		});
		
	}
	/**
	 * Test assert exception is thrown if password length does not meet minimum length
	 * */
	@Test
	void lengthTest_ExceptionIsThrown() {
		PasswordChecker password = new PasswordChecker();
		Exception exception = assertThrows(Exception.class, () ->{
			password.passwordIsValid("qwertd4");
		});
		
	}
	/**
	 * Test asserts method is counting number of condition met
	 * */
	@Test
	void passwordIsOkayTest() {
		PasswordChecker password = new PasswordChecker();
		assertTrue(password.passwordIsOkay("QWert@393"));
		//assertFalse(password.passwordIsOkay("QWert"));
	}
}
