import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.google.common.base.Preconditions;

public class ArmstrongNumberChecker {
    
    public static boolean isArmstrongNumber(int n) {
        Preconditions.checkArgument(n >= 100 && n <= 500, "Input must be a three-digit number between 100 and 500");
        
        int sum = 0;
        int temp = n;
        
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        
        return sum == n;
    }
}

