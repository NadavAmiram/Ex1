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
        assertEquals(-1, Ex1.number2Int("1234b11"));   // מבנה לא חוקי
        assertEquals(-1, Ex1.number2Int("3 b4"));   // מבנה לא חוקי
        assertEquals(-1, Ex1.number2Int("GbG"));   // מבנה לא חוקי
        assertEquals(-1, Ex1.number2Int("null"));   // מבנה לא חוקי

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
        assertTrue(Ex1.isNumber("FFbG"));
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
        String[] arr = {"1011b2", "FFbG", "0b10", "1111b2"};
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

    @Test
    void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v,11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v,2);
        int v2 = Ex1.number2Int(s2);
        assertEquals(v,v2);
        assertTrue(Ex1.equals(s10,s2));
    }

    @Test
    void isBasisNumberTest() {
        String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
        for(int i=0;i<good.length;i=i+1) {
            boolean ok = Ex1.isNumber(good[i]);
            assertTrue(ok);
        }
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for(int i=0;i<not_good.length;i=i+1) {
            boolean not_ok = Ex1.isNumber(not_good[i]);
            assertFalse(not_ok);
        }
    }
}
