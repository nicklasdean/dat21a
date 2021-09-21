package exceptions;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.WrongMethodTypeException;
import java.util.InputMismatchException;

public class CprValidator {
    public static void main(String[] args) {
        //Få input fra bruger
        String input = getUserInput();
        //Tjekke CprNummerets validitet
        boolean isValid = false;
        try {
             isValid = isValidCpr(input);
        }catch(InputMismatchException wrongCprInput){
            System.out.println("Wrong input");
        }
        System.out.println(isValid);
    }

    public static boolean isValidCpr(String cpr){
        //Vurder om brugeren har en valid længde på CPR nummer
        if(cpr.length() != 10) {
            throw new InputMismatchException();
        }
        else{
            return true;
        }
    }
    public static String getUserInput(){
        //Indsamle data:CPRNummer fra bruger
        return "15069333";
    }
}
