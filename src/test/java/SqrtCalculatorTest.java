import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalculatorTest extends BaseTest {

    @Test(dataProvider = "valuesForSqrtTest", groups = {"Unit_Tests"})
    public void makeTestCounts(double a, double expectedResult) {
        double result = calculator.sqrt(a);

        Assert.assertEquals(result, expectedResult, "Sqrt  is wrong");
    }

    @DataProvider(name = "valuesForSqrtTest")
    public Object[][] valuesForPow() {
        return new Object[][]{
                {25, 5},
                {16, 4}
        };
    }
}


