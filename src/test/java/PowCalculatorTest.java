import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalculatorTest extends BaseTest {

    @Test(dataProvider = "valuesForPowTest", groups = {"Unit_Tests"})
    public void makeTestCounts(double a, double b, double expectedResult) {
        double result = calculator.pow(a, b);

        Assert.assertEquals(result, expectedResult, "Pow  is wrong");
    }

    @DataProvider(name = "valuesForPowTest")
    public Object[][] valuesForPow() {
        return new Object[][]{
                {10, 1, 10},
                {10, -1, 0.1},
                {10,2, 100}

        };
    }

}
