import com.goodline.homework.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    private void sumTest() {
        assertEquals(25, Calculator.Sum(10, 15));
    }

}
