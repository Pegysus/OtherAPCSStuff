import java.util.*;

public class Favorites {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String movies[] = new String[3];
        String songs[] = new String[3];
        
        for(int i = 0; i < movies.length; i++) {
            System.out.print("Please enter your favorite movie: ");
            movies[i] = input.nextLine();
        }
        for(int i = 0; i < songs.length; i++) {
            System.out.print("Please enter your favorite song: ");
            songs[i] = input.nextLine();
        }
        
        for(int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }
        System.out.println();
        System.out.println();
        int index = 1;
        System.out.print(movies[0]);
        while(index < songs.length) {
            System.out.print(", " + movies[index]);
            index++;
        }
        System.out.println();
    }
}