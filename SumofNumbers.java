import java.util.*;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /*int sum = 0;
        for(int i = 0; i < 10; i++) {
            System.out.print("Please enter an integer: ");
            int val = input.nextInt();
            sum += val;
        }
        System.out.println("The sum of your integers is " + sum);*/
        
        int sum = 0; // initialize sum at 0
        String list = "", expression = "";
        for(int i = 0; i < 10; i++) {
            System.out.print("Please enter an integer: ");
            int val = input.nextInt(); // inputs integer and assign it to val (10 times)
            if(i == 0) { // checks if the input integer is the first one
                sum += val; // adds the value to sum
                list += val;
                expression += val;
            } else if(i % 2 == 1) { // checks if 
                sum += val;
                list += ", " + val;
                expression += " + " + val;
            } else {
                sum -= val;
                list += ", " + val;
                expression += " - " + val;
            }
            // above if statement helps alternate the value
        }
        System.out.println(list);
        System.out.println(expression + " = " + sum);
    }
}