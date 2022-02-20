package questions.question03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static questions.question03.Anagram.getHashCodeSum;

class AnagramTest {

    @Test
    @DisplayName("Should get the hashcode sum of all characters combined")
    void shouldGetTheHashcodeSumOfAllCharactersCombined() {
        // Arrange
        String string = "ovo";
        int expected = 340;

        // When
        int hashcodeSum = getHashCodeSum(string);

        // Then
        assertEquals(expected, hashcodeSum);
    }

}