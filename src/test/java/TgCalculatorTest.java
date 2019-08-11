import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgCalculatorTest extends BaseTest {

    @Test( groups = {"Unit_Tests"})
    public void makeTestCounts() {
        double result = calculator.tg(5);

    //       Assert.assertEquals(result, Math.tan(5), "Tangents  is wrong");
    }

}


