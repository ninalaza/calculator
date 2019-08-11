import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class isPositiveNumberCalculatorTest extends BaseTest {

    @Test( groups = {"Unit_Tests"})
    public void makeTestCounts() {
        boolean result = calculator.isPositive(10);

        Assert.assertTrue(result, "Is not positive");
    }

    }

