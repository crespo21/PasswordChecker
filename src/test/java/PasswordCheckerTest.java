

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordCheckerTest {
    @Test
    public void  exisitingPassword()  {

    assertEquals("password should exist",PasswordChecker.password_is_valid(""));
    }
@Test
    public  void passwordLength() {
        assertEquals("password should be longer than 8 characters",
                PasswordChecker.password_is_valid("abcdefg"));

    }
    @Test
    public  void upperCasePassword() {
        assertEquals("password should have at least one uppercase letter",
                PasswordChecker.password_is_valid("abcdefghi"));
    }
    @Test
    public  void lowerCasePassword() {
        assertEquals("password should have at least one lowercase letter",
                PasswordChecker.password_is_valid("ABCDEFGHI"));
    }
    @Test
    public  void digitPassword() {
        assertEquals("password should have at least one digit",
                PasswordChecker.password_is_valid("asdfghjkJ"));
    }@Test
    public  void passwordSpecialChar() {
        assertEquals("password should have at least one special character",
                PasswordChecker.password_is_valid("Asdfghjkt6"));
    }
    @Test
    public  void passwordIsValid() {
        assertEquals("Password is valid!",
                PasswordChecker.password_is_valid("asdfghjkJ9!"));
    }
    @Test
    public  void passwordIsOk() {
        assertEquals(true,
                PasswordChecker.passwordIsOk("asdfghjkJ9!"));
    }
}

