package com.umuzi.project;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) throws Exception {
        PasswordChecker p1 = new PasswordChecker();

        Logger logger = p1.classLogger;
        String password = "qwert1234yu@QWERT";

        try{
            FileHandler fileHandler = new FileHandler(".\\errors.log");
            logger.addHandler(fileHandler);
            fileHandler.setLevel(Level.INFO);
            p1.passwordIsValid(password);
        }catch (NoLowerCaseException e){
            logger.log(Level.INFO,"NoLowerCaseException has occurred",e);
            e.printStackTrace();
        }catch (NoUpperCaseException f){
            logger.log(Level.INFO,"NoUpperCaseException has occurred",f);
            f.printStackTrace();
        }catch (NoDigitException d){
            logger.log(Level.INFO,"NoDigitException has occurred",d);
            d.printStackTrace();
        }catch (NoSpecialCharacterException s){
            logger.log(Level.INFO,"NoSpecialCaseException has occurred",s);
            s.printStackTrace();
        }finally {
            System.out.println(p1.passwordIsOkay(password));
        }
    }
}
