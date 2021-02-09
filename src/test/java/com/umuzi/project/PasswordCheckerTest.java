/**
 * 
 */
package com.umuzi.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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

		assertThrows(NoDigitException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				PasswordChecker password = new PasswordChecker();
				password.passwordIsValid("oiuytreQWE@@dfg");
			}
		});
	}
	/**
	 * Test asserts NoLowerCase exception works
	 * */
	@Test
	void passwordIsValidTest_NoLowerCaseExceptionIsThrown() {
		assertThrows(NoLowerCaseException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				PasswordChecker passwordChecker = new PasswordChecker();
				passwordChecker.passwordIsValid("QW567ERT!@#$%QWER");
			}
		});
	}
	/**
	 * Test asserts NoUpperCase exception is working
	 * */
	@Test
	void passwordIsValidTest_NoUpperCaseExceptionIsThrown() {
		assertThrows(NoUpperCaseException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				PasswordChecker password = new PasswordChecker();
				password.passwordIsValid("rtyui98op#$%^&");
			}
		});
	}
	/**
	 * Test asserts NoSpecailChar exceptionn is functioning
	 * */
	@Test
	void passwordIsValidTest_NoSpecailCharacterExceptionIsThrown() {
		assertThrows(NoSpecialCharacterException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				PasswordChecker password = new PasswordChecker();
				password.passwordIsValid("QWERtyuio677");
			}
		});
	}
	/**
	 * Test asserts exception is thrown if password is empty
	 * */
	@Test
	void emptyPasswordTest_ExceptionIsThrown() {
		assertThrows(Exception.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				PasswordChecker passwordChecker = new PasswordChecker();
				passwordChecker.passwordIsValid("");
			}
		});
	}
	/**
	 * Test assert exception is thrown if password length does not meet minimum length
	 * */
	@Test
	void lengthTest_ExceptionIsThrown() {
		assertThrows(Exception.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				PasswordChecker passwordChecker = new PasswordChecker();
				passwordChecker.passwordIsValid("fghj");
			}
		});
	}
	/**
	 * Test asserts method is counting number of condition met
	 * */
	@Test
	void passwordIsOkayTest() {
		PasswordChecker passwordChecker = new PasswordChecker();
		boolean actual = passwordChecker.passwordIsOkay("GodFather@part3");
		assertTrue(actual);
	}
}
