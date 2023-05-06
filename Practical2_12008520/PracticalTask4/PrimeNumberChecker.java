package PracticalTask4;

public class PrimeNumberChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
              //12008520_JayeshS
            }
        }
        return true;
    }
}
//12008520_JayeshS
