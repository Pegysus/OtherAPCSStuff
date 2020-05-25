import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /*int counter = 0;
        double value = 0, sum = 0;
        do {
            System.out.print("Please enter a test score or -1 if you wish to quit: ");
            value = input.nextDouble();
            if(value > 0) {
                sum += value;
                counter++;
            }
        } while(value != -1);
        System.out.println("The average of your " + counter + " test scores is " + (sum/counter));
        
        int counter = 0;
        double value = 0, sum = 0;
        while(value != -1) {
            System.out.print("Please enter a test score or -1 if you wish to quit: ");
            value = input.nextDouble();
            if(value > 0) {
                sum += value;
                counter++;
            }
        }
        System.out.println("The average of your " + counter + " test scores is " + (sum/counter));*/
        
        System.out.print("How many test scores are you entering? ");
        int numScores = input.nextInt();
        double sum = 0;
        for(int i = 0; i < numScores; i++) {
            System.out.print("Please enter a test score: ");
            double value = input.nextDouble();
            sum += value;
        }
        System.out.println("The average of your " + numScores + " test scores is " + (sum/numScores));
    }
}