import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstJUnit5Test {

    @Test
    void simpleTest() {
        int expected = 2;
        int actual = 1 + 1;
        assertEquals(expected, actual, "1 + 1 should equal 2");
    }
}