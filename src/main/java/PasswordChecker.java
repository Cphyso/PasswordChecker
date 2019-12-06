//code makes use of ASCII table for identification of inputs

public class PasswordChecker {

    //check if password exists, returns true if there is an input
    public static boolean passwordExist(String password){
        return password.length() > 0;
    }

    //check if password length is greater than 8 characters
    public  static boolean passwordLength(String password){
        return password.length() > 8;
    }

    //check if password has at least one lower case character
    public static boolean checkLowerCaseCharacter(String password){

        int countLowerCase = 0;

        for (int i = 0; i < password.length(); i++) {
            if (((byte) password.charAt(i) >= 97) && ((byte) password.charAt(i) <= 122)){
                countLowerCase++;
            }
        }
        return (countLowerCase > 0);
    }

    //check if the password contains at least one upper case character
    public static boolean checkUpperCaseCharacter(String password){
        int countUpperCase = 0;
        for (int i = 0; i < password.length(); i++) {
            if (((byte) password.charAt(i) >= 65) && ((byte) password.charAt(i) <= 90)){
                countUpperCase++;
            }
        }
        return  (countUpperCase > 0);
    }

    //check if the password contains at least one numeric character
    public static boolean checkNumber(String password){
        int countNumbers = 0 ;
        for (int i = 0; i < password.length(); i++) {
            if(((byte) password.charAt(i) >= 48) && (password.charAt(i) <= 57)){
                countNumbers++;
            }
        }
        return (countNumbers > 0);
    }

    //check if the password contains at least one special character
    public static boolean checkSpecialCharacter(String password){

        int countSpecialCharacter = 0;

        for (int i = 0; i < password.length(); i++){

            if (((byte) password.charAt(i) >= 123) && (password.charAt(i) <= 126)){
                countSpecialCharacter ++;
            }
            else if(((byte) password.charAt(i) >= 91) && (password.charAt(i) <= 96 )){
                countSpecialCharacter ++;
            }
            else if((byte) password.charAt(i) >= 58 && (password.charAt(i) <= 64)){
                countSpecialCharacter ++;
            }
            else if (((byte) password.charAt(i) >= 32) && (password.charAt(i) <= 47) ){
                countSpecialCharacter ++;
            }

        }
        return (countSpecialCharacter > 0);
    }

}
