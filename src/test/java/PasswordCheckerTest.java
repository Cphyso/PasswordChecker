import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class PasswordCheckerTest {

    // PasswordChecker passwordCheckerObject = new PasswordChecker();
    @Test
    void testExistence() {
        assert PasswordChecker.passwordExist("yofcuoajhd") : " Test Case Should PASS"; // test should pass since there is character input
        assert PasswordChecker.passwordExist(" ") : " Test Case Should PASS";         //test should pass
        //assert PasswordChecker.passwordExist("") : " Test Case Should FAIL";          // test should FAIL since there is no input
    }

    @Test
    void testLength() {
        assert PasswordChecker.passwordLength("uikefdjkegfio") : "Test Case Should PASS";    // test should pass because password length is greater than 8
        //assert PasswordChecker.passwordLength("utru") : "Test Case Should FAIL";      // test should FAIL because length of the password is less than 8
    }

    @Test
    void testLowerCaseChars() {
        assert PasswordChecker.checkLowerCaseCharacter("uyfoufued") : "Test Case should PASS";
//        assert PasswordChecker.checkLowerCaseCharacter("UOGETBUYJD") : "Test Case should FAIL";    // test should FAIL because there is not a single lower case character
    }

    @Test
    void UpperCaseChars() {
        assert PasswordChecker.checkUpperCaseCharacter("YIHJSDCIOWYEH") : "Test Case should PASS";
        //  assert PasswordChecker.checkUpperCaseCharacter("tudfgiyrigh"): "Test Case should FAIL because there is no upper case character";
    }

    @Test
    void testNumbers() {
        assert PasswordChecker.checkNumber("702560764570") : "Test Case should PASS";
        //assert PasswordChecker.checkNumber("yilfgwryigkld") : "Test Case should FAIL because there is no number character";

    }

    @Test
    void testSpecialCharacter() {
        // 1st if
        assert PasswordChecker.checkSpecialCharacter("{klwygrfiyl{{{") : "Test should PASS";  // lower bound --> {
        assert PasswordChecker.checkSpecialCharacter("~~~gwirgvll") : "Test should PASS";   // upper bound --> ~
        assert PasswordChecker.checkSpecialCharacter("ljhui333wu|2") : "Test should PASS";
        assert PasswordChecker.checkSpecialCharacter("jhi9769994}") : "Test should PASS";
        // 2nd if
        assert PasswordChecker.checkSpecialCharacter("jhqyduy[232") : "Test should PASS";  // lower bound --> [
        assert PasswordChecker.checkSpecialCharacter("jlqudfo38_") : "Test should PASS";  // upper bound --> _
        assert PasswordChecker.checkSpecialCharacter("kdfkuj^697") : "Test should PASS";
        assert PasswordChecker.checkSpecialCharacter("kuyfyui--") : "Test should PASS";

        // 3rd if
        assert PasswordChecker.checkSpecialCharacter("bkjgreiu:") : "Test should PASS";  // lower bound --> :
        assert PasswordChecker.checkSpecialCharacter("ukl57;489ghb") : "Test should PASS";  // upper bound --> ;
        assert PasswordChecker.checkSpecialCharacter("mnkk3353fa@") : "Test should PASS";
        assert PasswordChecker.checkSpecialCharacter("gy68uy4h=") : "Test should PASS";

        // 4th if
        assert PasswordChecker.checkSpecialCharacter("uigeqwiy%231") : "Test should PASS";
        assert PasswordChecker.checkSpecialCharacter("gyu4386 972g") : "Test should PASS";   // check if detects space as a special character(lower bound)
        assert PasswordChecker.checkSpecialCharacter("p8orgvusbe") : "Test should PASS";
        assert PasswordChecker.checkSpecialCharacter("..67778ghjhh.") : "Test should PASS";   // check if detects a dot as a special char(upper bound)
        assert PasswordChecker.checkSpecialCharacter("onke10222/") : "Test should PASS";


        //assert PasswordChecker.checkSpecialCharacter("dfwsyigrywi79678967") : "Test should FAIL, there is no special character";
    }
}
