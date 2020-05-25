import java.util.*;

public class MersennePrime {
    public static void main(String[] args) {
        int counter = 0, curNum = 1;
        while(counter < 8) {
            int prime = (int) Math.pow(2, curNum) - 1;
            boolean checkPrime = true;
            System.out.println("Current prime: " + prime);
            for(int i = 2; i < prime; i++) {
                if(prime%i == 0) {
                    checkPrime = false;
                    break;
                }
            }
            if(checkPrime == true && curNum != 1) {
                long perfect = (long) Math.pow(2, curNum-1) * (long) prime;
                System.out.println("2^" + curNum + "-1 = " + prime + " is a prime");
                System.out.println("2^" + (curNum-1) + "(2^" + curNum + "-1) = " + perfect + 
                " is a perfect number");
                counter++;
            }
            curNum++;
        }
    }
}