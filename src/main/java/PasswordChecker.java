import java.util.Scanner;
//The  PasswordChecker class compiles methods
// which checks if the password entered is valid, if is ok and if is never ok.
public class PasswordChecker {

       //A conditional method that requires the password to always exist
       static boolean passwordExist = true;
       //A conditional method that checks if the
       //password is always specified and meets required length
       static boolean passwordCharLength = true;
       //A conditional method that checks if the
       //password always matches a lower case letter
       static boolean passwordLowerCase = true;
       //A static conditional method that checks if the
       //password always matches an upper case letter
       static boolean passwordUpperCase = true;
       //A static conditional method that checks if the
       //password always matches a  digit
       static boolean passwordOneDigit = true;
       //A static conditional method that checks if the
       //password always matches a Special character
       static boolean passwordOneSpecialChar = true;

    // The method passwordIsValid checks if password is empty,
    // if is less than 8 characters, if it matches Uppercase
    // and lowercase letters,if password matches at least one digit and
    // at least one special character. If not then each conditional
    // statement returns a string treated like an error message.
    // passwordIsValid method returns the parameter of type String 'password'.
    public static String passwordIsValid(String password) {

        //if password is empty,type boolean passwordExist is false,
        //returns a string message "password should exist"
        if (password.isEmpty()){
                passwordExist = false;
                return ("password should exist");
        }

        //if password length is less than 8 characters,
        // type boolean passwordCharLength is false,
        //returns a string message like it's an error
        if (password.length() < 8){
                 passwordCharLength = false;
                return("password should be longer than 8 characters");
        }

        //if password does not match Upper case letter
        // type boolean passwordUpperCase is false,
        //returns a string message like it's an error
        if (!password.matches((".*[A-Z].*"))){
                 passwordUpperCase = true;
                 return ("password should have at least one uppercase letter");
        }

        //if password does not match Upper case letter
        //type boolean passwordLowerCase is false,
        //returns a string message like it's an error
        if (!password.matches((".*[a-z].*"))){
                passwordLowerCase = false;
                 return "password should have at least one lowercase letter";
        }

        //if password does not match a digit
        //type boolean passwordOneDigit is false,
        //returns a string message like it's an error
        if (!password.matches((".*[\\d].*"))){
                 passwordOneDigit = false;
                 return ("password should have at least one digit");
        }

        //if password does not match a special character
        // type boolean passwordOneSpecialChar is false,
        //returns a string message like it's an error
        if (!password.matches((".*[-!@#$%^&*(){}_\"'\\\\;|?/.>,<:].*"))){
                passwordOneSpecialChar = false;
                return ("password should have at least one special character");
        }

        //passwordIsValid returns type String 'password'.
        return password;
    }

    //passwordIsOk method checks if the given password meets
    //at least three of the conditions or not,
    //password length and password existence being default conditions.
    //The method returns a conditional  feedback
    //called 'passwordIsOkChecker' stating whether
    //passwordIsOk is true or false
    //from the given password.
    public static  boolean passwordIsOk(String password){

        //Declaring a variable to check whether the password is ok or not ok.
        boolean passwordIsOkChecker;

            //checks if the password does not meet at least three of the conditions,
            // if so the variable 'passwordIsOkChecker' is false,
            //else the variable 'passwordIsOkChecker' is true
            //and print out a message to the console stating the condition based on password given,
            if(password.length() < 8 && password.isEmpty() &&!password.matches((".*[A-Z].*")) ||
                    !password.matches((".*[a-z].*")) || !password.matches((".*[\\d].*")) ||
                    !password.matches((".*[-!@#$%^&*(){}_\"'\\\\;|?/.>,<:].*"))){
                passwordIsOkChecker = false;
                System.out.println("Password not ok!");
            }
            else{
                passwordIsOkChecker = true;
                System.out.println("password is ok!");
            }
        return passwordIsOkChecker;
        }

    //passwordIsNeverOk method checks with a nested 'if  condition whether
    //the given password is not greater or equal 8, and if the password is empty,
    //if this conditions are met, return false,
    //print a relevant message on the console
    //else return true
    public static boolean passwordIsNeverOk(String password) {

        //if password is not greater or equal 8,if password is empty
        //print  relevant message for each condition
        //then return false, else return true
        if (!(password.length() >= 8)) {
            if (password.isEmpty()) {
                System.out.println("Empty passwords are invalid!");
            }
            System.out.println("Password must be 8 characters long!");
            return false;
        }
        else {
            return true;
        }
    }

        public static void main(String[] args) {
        //Password instructions
            System.out.println("Please note that your password: " +
                    "\n " + "1. Shouldn't be empty." +
                    "\n 2. Must be longer than 8 characters." +
                    "\n 3. Must contain at least one UPPERCASE & lowercase letter." +
                    "\n 4. Should have At least one digit." +
                    "\n 5. Should have  A special character.");

            System.out.println(" ");
            //instantiating a Scanner object that allows user input from  the console
            Scanner input = new Scanner(System.in);
            //Call To Action
            System.out.println("Please enter your password");

            //A string object that stores input from the user
            String userPassword = input.nextLine();

            //catching all  errors faced when printing out on the console
            // passwordIsValid, passwordIsOk,
            // and passwordIsNeverOk methods taking userPassword as a input
            try {
                 System.out.println(passwordIsValid(userPassword));
                 System.out.println(passwordIsOk(userPassword));
                 System.out.println(passwordIsNeverOk(userPassword));
             }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
