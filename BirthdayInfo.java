import java.util.*;

public class BirthdayInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates scanner
        
        System.out.print("Please enter your birth month: ");
        String month = input.nextLine(); // Inputs the month as an integer
        
        switch(month) {
            case "January": case "February": case "March":
            System.out.println("You were born in the first quarter of the year.");
            break;
            
            case "April": case "May": case "June":
            System.out.println("You were born in the second quarter of the year.");
            break;
            
            case "July": case "August": case "September":
            System.out.println("You were born in the third quarter of the year.");
            break;
            
            case "October": case "November": case "December":
            System.out.println("You were born in the fourth quarter of the year.");
            break;
            
            default:
            System.out.println("Not a valid month, please enter a valid one.");
            break;
        }
    }
}
