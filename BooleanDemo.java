import java.util.*;

public class BooleanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates scanner for input
        
        System.out.print("Please enter your username: ");
        String username = input.nextLine(); // Inputs the username
        System.out.print("Please enter your password: ");
        int password = input.nextInt(); // Inputs the password
        
        // Checks if username and password is correct
        if(username.equals("Michael") && password == 1234) {
            System.out.println("Login successful");
        }
    }
}