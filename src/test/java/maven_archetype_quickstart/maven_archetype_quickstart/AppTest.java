
package maven_archetype_quickstart.maven_archetype_quickstart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    SalaryCalculator calculator = new SalaryCalculator();

    @Test
    public void testGrossSalary() {
        double result = calculator.calculateGrossSalary(30000, 6000, 3000);
        assertEquals(39000, result, 0.001);
    }

    @Test
    public void testNetSalary() {
        double result = calculator.calculateNetSalary(39000, 4000);
        assertEquals(35000, result, 0.001);
    }

    @Test
    public void testZeroDeductions() {
        double result = calculator.calculateNetSalary(39000, 0);
        assertEquals(39000, result, 0.001);
    }

    @Test
    public void testFullDeductions() {
        double result = calculator.calculateNetSalary(39000, 39000);
        assertEquals(0, result, 0.001);
    }

    @Test
    public void testNegativeBasicPay() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateGrossSalary(-30000, 6000, 3000);
        });
    }

    @Test
    public void testNegativeDeductions() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateNetSalary(39000, -4000);
        });
    }

    @Test
    public void testExcessDeductions() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateNetSalary(39000, 40000);
        });
    }
}
