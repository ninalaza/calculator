import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DifferenceCalculatorTest extends BaseTest {

    @Test (dataProvider = "valuesForDifferenceTest", groups = {"Unit_Tests"})
    public void makeTestCounts(long a, long b, long expectedResult) {

        long result = calculator.sub(a,b);

        Assert.assertEquals(result, expectedResult, "Difference has wrong result");
    }

    @DataProvider(name = "valuesForDifferenceTest")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {10, 5, 5},
                {10, 20, -10},
                {0, 0, 0},
                {10, -10, 20}
        };
    }
}
