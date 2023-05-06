package Practical1Demo;

import org.junit.Test;

public class PracticalExample {
@Test
	 public static void main(String[] args) {
	        int tempNumber, digit, digitCubeSum;

	        for (int inputArmstrongNumber = 0; inputArmstrongNumber < 1000; inputArmstrongNumber++) {
	            tempNumber = inputArmstrongNumber;
	            digitCubeSum = 0;
	            while (tempNumber != 0) {

	                /* On each iteration, remainder is powered by thetempNumber of digits n
	                 */

	                digit = tempNumber % 10;

	                //sum of cubes of each digits is equal to thetempNumber itself
	                digitCubeSum = digitCubeSum + digit * digit * digit;

	                tempNumber /= 10;

	            }

	            //check giventempNumber and digitCubeSum is equal to or not 
	            if (digitCubeSum == inputArmstrongNumber)
	                System.out.println(inputArmstrongNumber + " is an Armstrong Number");

	        }

	    }
}
