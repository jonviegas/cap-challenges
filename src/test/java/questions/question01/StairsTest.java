package questions.question01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static questions.question01.Stairs.buildStairs;

class StairsTest {

    @Test
    @DisplayName("Should build stairs")
    void shouldBuildStairs() {
        // Arrange
        int size = 4;
        String[] stair = new String(new char[size]).replace("\0", " ").split("");
        String lastLadder = "****";

        // When
        buildStairs(size, stair);

        // Then
        assertEquals(String.join("", stair), lastLadder);
    }

}