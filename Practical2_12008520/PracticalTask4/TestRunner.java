package PracticalTask4;
//12008520_JayeshS
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);
      //12008520_JayeshS
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }//12008520_JayeshS

        System.out.println("Tests run: " + result.getRunCount());
        System.out.println("Tests failed: " + result.getFailureCount());
        System.out.println("Tests passed: " + (result.getRunCount() - result.getFailureCount()));
    }
}
//12008520_JayeshS