import java.util.Scanner;

public class PasswordChecker {
        static boolean passwordExist = true;
        static boolean passwordCharLength = true;
        static boolean passwordLowerCase = true;
        static boolean passwordUpperCase = true;
        static boolean passwordOneDigit = true;
        static boolean passwordOneSpecialChar = true;
    public static String password_is_valid(String password) {
            String msg = "";
            if (password.isEmpty()) {
                passwordExist = false;
                msg = "password should exist";
            }
            else if (password.length() < 8 ){
                 passwordCharLength = false;
                msg = "password should be longer than 8 characters";
            }
            else if (!password.matches((".*[A-Z].*"))){
                 passwordUpperCase = true;
                msg="password should have at least one uppercase letter";
            }
            else if (!password.matches((".*[a-z].*"))){
                passwordLowerCase = false;
                msg="password should have at least one lowercase letter";
            }
            else if (!password.matches((".*[\\d].*"))){
                 passwordOneDigit = false;
                msg="password should have at least one digit";
            }
            else if (!password.matches((".*[-!@#$%^&*(){}_\"\"';|?/.>,<:].*"))){
                passwordOneSpecialChar = false;
                msg="password should have at least one special character";
            }
            else{
                msg="Password is valid!";
            }
            return msg ;
        }
    public static  boolean passwordIsOk(String password){
                 boolean check;
            if(!password.isEmpty() && password.length() >= 8 &&
                    password.matches((".*[A-Z].*")) ||
                    password.matches((".*[a-z].*")) || !password.matches((".*[\\d].*")) ||
                    password.matches((".*[-!@#$%^&*(){}_\"\"';|?/.>,<:].*"))){
                    System.out.println("Password is ok!");
                    check =true;
            } else{
                System.out.println("password is not ok,");
                check = false;
            }
            return check;
        }

    public static boolean passwordIsNeverOk(String password) {
        if (password.length() < 8)
        {
            if (password.isEmpty())
            {
                System.out.println("empty passwords are invalid");
            }
            System.out.println("Password must be 8 characters long!");
        }

        return true;
    }
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("(Please Note: Your password shouldn't be empty," +
                    "\n must be longer than 8 characters," +
                    "\n contains at least one Uppercase & lowercase letter," +
                    "\n and at least one digit & a special character.)");
            System.out.println("");
            System.out.println("Please enter your password");

            String userPassword = input.nextLine();
            try {
                 System.out.println(password_is_valid(userPassword));
                 System.out.println(passwordIsOk(userPassword));
                 System.out.println(passwordIsNeverOk(userPassword));
             }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
