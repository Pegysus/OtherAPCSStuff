import java.util.*;

public class IntegerIf {
    public static void main(String[] args) {
        int a = 4; // Create integer a with value 4
        int b = 6; // Create integer b with value 6
        
        if(a < b) { // Checks if a is less than b
            System.out.println("The value of a is " + a + " and it is less than b whose value is "
            + b + ".");
        } else if (a > b) { // Check if a is greater than b
            System.out.println("The value of a is " + a + " and it is greater than b whose value is "
            + b + ".");
        } else { // If not greater or less than each other, they must be equal
            System.out.println("The value of a is " + a + " and it is equal to b whole value is "
            + b + ".");
        }
    }
}