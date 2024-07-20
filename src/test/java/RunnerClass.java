import org.example.extentConfig.ExtentReportListener;
import org.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

//@Listeners(ExtentReportListener.class)
public class RunnerClass {
    @Test
    public void runTestNG() {
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<>();
        suites.add("testng.xml"); // Replace with your XML suite file path
        testNG.setTestSuites(suites);
        testNG.run();
    }
}
