import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input an integer: ");
        int number = input.nextInt();
        int sum = 0; String expression = "";
        while(number > 0) {
            int curDigit = number%10;
            if(sum==0) {
                expression += curDigit;
            } else {
                expression += " + " + curDigit;
            }
            sum += curDigit;
            number /= 10;
        }
        System.out.println(expression + ", " + sum);
    }
}