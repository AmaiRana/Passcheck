import java.nio.charset.CharacterCodingException;
import java.util.Locale;
import java.util.*;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String str = input.nextLine();
        System.out.println("You have entered: " + str);
        passwordchecker(str);
    }


    public static void passwordchecker(String str){
        if (str.length() < 8)
        {
            System.out.println("Password must be more than 8 characters");
            char charactercheck;
            int count = 1;
            for (int i = 0; i < str.length(); i++) {
                charactercheck = str.charAt(i);
                if (!Character.isLetterOrDigit(charactercheck)) {
                    System.out.println("This password is accepted");
                }
                if (Character.isDigit(charactercheck)){
                    count++;
                    if (count < 1) {
                        System.out.println("Needs at least 2 digits");
                    }

                }
            }
        }
        if (str.equals(str.toUpperCase())){
            System.out.println("Needs a lower case letter");
        }
        if (str.equals(str.toLowerCase())){
            System.out.println("Needs an upper case letter");
        }

    }

}
