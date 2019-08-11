import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SummaCalculatorTest extends  BaseTest{

    @Test (dataProvider = "valuesForSumTest", groups = {"Unit_Tests"})
    public void makeTestCounts(long a, long b, long expectedResult){
        long result = calculator.sum(a,b);

        Assert.assertEquals(result, expectedResult , "Sum  is wrong");
    }
    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForDivision() {
        return new Object[][]{
                {10, 5, 15},
                {10, -5, 5},
                {-10, -5, -15},
                {0,0,0,}

        };
    }



}
