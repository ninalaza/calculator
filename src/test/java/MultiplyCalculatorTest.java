import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyCalculatorTest extends BaseTest {


    @Test(dataProvider = "valuesForMultiplyTest", groups = {"Unit_Tests"})
    public void makeTestCounts(long a, long b, long expectedResult){
        long result = calculator.mult(a,b);

        Assert.assertEquals(result, expectedResult , "Multiply  is wrong");
    }
    @DataProvider(name = "valuesForMultiplyTest")
    public Object[][] valuesForMultiply() {
        return new Object[][]{
                {10, 5, 50},
                {10, -5, -50},
                {-10, -5, 50},
                {0,0,0,}

        };
    }
}
