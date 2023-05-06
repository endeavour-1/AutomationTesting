package ParameterizedArithmetic;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
		public static void main(String[] args) {
			Result result = JUnitCore.runClasses(ArithmeticTest.class);
			for (org.junit.runner.notification.Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
				}
			
			System.out.println(result.wasSuccessful());
		}
	}
