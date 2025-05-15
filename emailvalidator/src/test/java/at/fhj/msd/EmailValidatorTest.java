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
        String validText = "xyz";
        assertTrue(calc.javamethodname(validText));
    }

    @Test
    public void testInvalidText() {
        String invalidText = "wqüäö";
        assertFalse(calc.javamethodname(invalidText));
    }







}
