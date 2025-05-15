package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import at.fhj.user.EmailValidator;

public class EmailValidatorTest {
    
private EmailValidator validator;

  @Test
    public void testValidText() {
        String validText = "user@example.com";
        assertTrue(validator.isValid(validText));
    }

    @Test
    public void testInvalidText() {
        String invalidText = "userexample.org";
        assertFalse(validator.isValid(invalidText));
    }
}
