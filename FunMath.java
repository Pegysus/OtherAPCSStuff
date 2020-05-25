import java.util.*;
import java.lang.Math.*;

public class FunMath {
    public static void main(String[] args) {
        // Create the scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the length and width: ");
        int length = input.nextInt(); // inputs integer a
        int width = input.nextInt(); // inputs integer b
        
        System.out.println("2"+"2");
        
        System.out.println("The average of the integers is " + (((double) length+ (double) width)/2)); // Prints average
        
        // Output area and perimeter
        System.out.println("The area is " + (length*width));
        System.out.println("The perimeter is " + (2*(length+width)));
        // Output the diagonal length
        System.out.println("The diagonal length is " + Math.sqrt(length*length + width*width));
    }
} 
