import java.util.*;

public class StringEquals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates scanner
        
        System.out.print("Please enter your four letter password: ");
        String password = input.nextLine(); // takes user input of the four letter password
        
        if(password.equals("maka")) { // checks if password is correct
            System.out.println("Password is correct, login successful.");
        } else { // If not correct, execute following line
            System.out.println("Wrong, try again");
        }
    }
}