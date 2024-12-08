import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This JUnit class represents tests for Ex1 class.
 */
public class Ex1Test {

    @Test
    void number2IntTest() {
        assertEquals(11, Ex1.number2Int("1011b2"));
        assertEquals(0, Ex1.number2Int("0b10"));
        assertEquals(11, Ex1.number2Int("11b10"));
        assertEquals(-1, Ex1.number2Int("123b17")); // בסיס לא חוקי
        assertEquals(-1, Ex1.number2Int("12b"));   // מבנה לא חוקי
    }

    @Test
    void int2NumberTest() {
        assertEquals("1011b2", Ex1.int2Number(11, 2));
        assertEquals("0b10", Ex1.int2Number(0, 10));
        assertEquals("", Ex1.int2Number(-1, 10)); // מספר שלילי
        assertEquals("", Ex1.int2Number(11, 17)); // בסיס לא חוקי
    }

    @Test
    void isNumberTest() {
        assertTrue(Ex1.isNumber("1011b2"));
        assertTrue(Ex1.isNumber("FFb16"));
        assertFalse(Ex1.isNumber("123b17")); // בסיס לא חוקי
        assertFalse(Ex1.isNumber("12b"));   // מבנה לא חוקי
        assertFalse(Ex1.isNumber(""));      // מחרוזת ריקה
    }

    @Test
    void equalsTest() {
        assertTrue(Ex1.equals("1011b2", "11b10"));
        assertFalse(Ex1.equals("1011b2", "12b10"));
    }

    @Test
    void maxIndexTest() {
        String[] arr = {"1011b2", "FFb16", "0b10", "1111b2"};
        assertEquals(1, Ex1.maxIndex(arr)); // המספר הגדול ביותר בבסיס 16
    }

    @Test
    void returnCharInIntTest() {
        assertEquals(10, Ex1.returnCharInInt('A'));
        assertEquals(15, Ex1.returnCharInInt('F'));
        assertEquals(7, Ex1.returnCharInInt('7'));
        assertEquals(0, Ex1.returnCharInInt('0'));
    }

    @Test
    void checkValidTest() {
        assertTrue(Ex1.checkValid("1011", 2));
        assertFalse(Ex1.checkValid("1021", 2)); // הספרה '2' לא חוקית בבסיס 2
        assertTrue(Ex1.checkValid("FF", 16));
        assertFalse(Ex1.checkValid("FG", 16)); // 'G' לא חוקי בבסיס 16
    }
}
