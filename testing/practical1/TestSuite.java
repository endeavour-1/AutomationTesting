package practical1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



public class TestSuite {
	@RunWith(Suite.class)

	@SuiteClasses ( {TestClassFail.class, TestClassPass.class} )
	

}