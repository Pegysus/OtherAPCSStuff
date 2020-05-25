import java.util.*;

public class Branches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an integer x: ");
        int x = input.nextInt();
        
        if(x > 0) {
            x = 1;
        } else if (x < 0) {
            x = -1;
        } else {
            x = 0;
        }
        System.out.println("x is now " + x);
    }
}