import java.util.*;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates scanner
        
        System.out.print("Please enter integer a: ");
        int a = input.nextInt(); // Inputs first factor a
        System.out.print("Please enter integer b that is relatively prime to a: ");
        int b = input.nextInt(); // Inputs second factor b
        System.out.print("Please enter integer n that is greater than a or b: ");
        int num = input.nextInt(); // Inputs number from user
        
        // Creates integer multiples, num/a is the number of multiples of a below num
        // num/b is the number of multiples of b below num
        // num/(a*b) is the number of multiples of a*b. We subtract this because we overcount
        // when we take multiples of num/a and num/b
        int multiples = num/a + num/b - num/(a*b);
        
        // Prints the multiples
        System.out.println("They have " + multiples + " multiples.");
    }
}