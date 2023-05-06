package ParameterizedArithmetic;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import java.util.Collection;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;



@RunWith(Parameterized.class)
public class ArithmeticTest {
	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private Arithmetic arithmetic;
	
	public ArithmeticTest(int firstNumber, int secondNumber, int expectedResult) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
	}
@Before
public void initialize() {
	arithmetic = new Arithmetic();
	
}
@Parameterized.Parameters
public static Collection input() {
	return Arrays.asList(new Object[][] {{ 1, 2, 3}, { 11, 22, 33},
		{ 111, 222, 333 },{ 10, 9, 19 }, { 100, 9, 109}});
}
@Test
public void testArithmeticTest() {
	System.out.println("Sum of Numbers = : " + expectedResult);
	assertEquals(expectedResult, arithmetic.sum(firstNumber, secondNumber));
}
}


