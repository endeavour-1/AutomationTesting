package package1Jayesh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class1ExampleTest 
{

	@Test
	void test1() {
		Class1Example fc = new Class1Example();//Object
		
		int x=fc.factor(4); // Calling Method
		
		assertEquals(x,24); // Expected Value is 24.
		
		
	}
	
	
}

	
	
/*@Test
	void testGetClass() {
		fail("Not yet implemented");
	}
	
	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}*/
