package questions.question02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static questions.question02.Password.calculateRequiredCharacters;
import static questions.question02.Password.testConditions;

class PasswordTest {

    @Test
    @DisplayName("Should return 0 when password matches all conditions")
    void shouldReturn0WhenPasswordMatchesAllConditions() {
        String password = "Aloha@123";

        // When
        int requiredCharacters = calculateRequiredCharacters(testConditions(password), password);

        // Assert
        assertEquals(requiredCharacters, 0);
    }

    @Test
    @DisplayName("Should return a number greater than 0 when lowercase condition is not satisfied")
    void shouldReturnANumberGreaterThan0WhenLowercaseConditionIsNotSatisfied() {
        String password = "ALOHA@123";

        // When
        int requiredCharacters = calculateRequiredCharacters(testConditions(password), password);

        // Assert
        assertTrue(requiredCharacters > 0);
    }

    @Test
    @DisplayName("Should return a number greater than 0 when uppercase condition is not satisfied")
    void shouldReturnANumberGreaterThan0WhenUppercaseConditionIsNotSatisfied() {
        String password = "aloha@123";

        // When
        int requiredCharacters = calculateRequiredCharacters(testConditions(password), password);

        // Assert
        assertTrue(requiredCharacters > 0);
    }

    @Test
    @DisplayName("Should return a number greater than 0 when number condition is not satisfied")
    void shouldReturnANumberGreaterThan0WhenNumberConditionIsNotSatisfied() {
        String password = "Aloha@";

        // When
        int requiredCharacters = calculateRequiredCharacters(testConditions(password), password);

        // Assert
        assertTrue(requiredCharacters > 0);
    }

    @Test
    @DisplayName("Should return a number greater than 0 when character condition is not satisfied")
    void shouldReturnANumberGreaterThan0WhenCharacterConditionIsNotSatisfied() {
        String password = "Aloha123";

        // When
        int requiredCharacters = calculateRequiredCharacters(testConditions(password), password);

        // Assert
        assertTrue(requiredCharacters > 0);
    }

    @Test
    @DisplayName("Should return a number greater than 0 when password is less than six characters")
    void shouldReturnANumberGreaterThan0WhenPasswordIsLessThanSixCharacters() {
        String password = "Alo@1";

        // When
        int requiredCharacters = calculateRequiredCharacters(testConditions(password), password);

        // Assert
        assertTrue(requiredCharacters > 0);
    }

}