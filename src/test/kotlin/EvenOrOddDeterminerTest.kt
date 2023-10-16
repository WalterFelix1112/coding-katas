import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class EvenOrOddDeterminerTest {
    @Test
    @DisplayName("Should return \"Odd\" for num = 1")
    fun testPositiveOddNumbers() {
        assertEquals("Odd", EvenOrOddDeterminer.run(1));
    }

    @Test
    @DisplayName("Should return \"Even\" for num = 2")
    fun testPositiveEvenNumbers() {
        assertEquals("Even", EvenOrOddDeterminer.run(2));
    }

    @Test
    @DisplayName("Should return \"Odd\" for num = -1")
    fun testNegativeOddNumbers() {
        assertEquals("Odd", EvenOrOddDeterminer.run(-1));
    }

    @Test
    @DisplayName("Should return \"Even\" for num = -2")
    fun testNegativeEvenNumbers() {
        assertEquals("Even", EvenOrOddDeterminer.run(-2));
    }

    @Test
    @DisplayName("Should return \"Even\" for num = 0")
    fun testZero() {
        assertEquals("Even", EvenOrOddDeterminer.run(0));
    }
}