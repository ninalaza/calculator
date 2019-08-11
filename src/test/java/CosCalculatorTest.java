import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalculatorTest extends BaseTest {

    @Test( groups = {"Unit_Tests"})
    public void makeTestCounts() {
        double result = calculator.cos(5);

     //   Assert.assertEquals(result, Math.cos(5), "Cos  is wrong");
    }

    }


