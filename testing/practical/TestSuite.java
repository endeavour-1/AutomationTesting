package practical;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({PassCases.class, FailCases.class})
public class TestSuite {
// Test suite that runs both the UnsuccessfulCase and SuccessfulCase test classes
}