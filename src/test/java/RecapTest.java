import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecapTest {


    @Test
    void myFirstTest() {
        Assertions.assertTrue(true);
    }

    @Test
    void assertEqualsRecap() {
        int a = 1;
        int b = 2;

        Assertions.assertEquals(a, b);
    }
}
