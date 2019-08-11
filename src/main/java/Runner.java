import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;


public class Runner{

    public static void main(String[] args) {
        TestNG testNg = new TestNG();
       // testNg.addListener(new TestListeners());

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("./src/main/resources/testng.xml"));


        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testNg.setXmlSuites(suites);
        testNg.run();
    }

}