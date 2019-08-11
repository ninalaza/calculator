import org.testng.Assert;
import org.testng.annotations.Test;

public class isNegativeCalculatorTest extends BaseTest {

    @Test( groups = {"Unit_Tests"})
    public void makeTestCounts() {
        boolean result = calculator.isNegative(-10);

        Assert.assertTrue(result, "Is not negative");
    }

}