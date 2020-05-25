import java.util.*;

public class Fencepost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the number of fenceposts there are: ");
        int fence = input.nextInt();
        System.out.print("|");
        for(int i = 0; i < fence-1; i++) {
            System.out.print("==|");
        }
        System.out.println();
    }
}