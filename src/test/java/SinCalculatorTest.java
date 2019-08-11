import org.testng.Assert;
import org.testng.annotations.Test;

public class SinCalculatorTest extends BaseTest {
    @Test( groups = {"Unit_Tests"})
    public void makeTestCounts() {
        double result = calculator.sin(5);

          Assert.assertEquals(result, Math.sin(5), "Sin is wrong");
    }

}

