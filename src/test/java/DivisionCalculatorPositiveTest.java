import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionCalculatorPositiveTest extends BaseTest {

    @Test(dataProvider = "valuesForDivisionTest", groups = {"Unit_Tests"})
    public void makeTestCounts(long a, long b, long expectedResult) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Division is wrong");
    }

    @DataProvider(name = "valuesForDivisionTest")
    public Object[][] valuesForDivision() {
        return new Object[][]{
                {10, 5, 2},
                {10, -5, -2},
                {-10, -5, 2},

        };
    }


}
