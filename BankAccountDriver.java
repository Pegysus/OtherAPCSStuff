import java.util.*;
public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(27.93);
        BankAccount ba2 = new BankAccount(1004.32);
        BankAccount ba3 = new BankAccount(784.34);
        // Put bank accounts into a list
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(ba1);
        list.add(ba2);
        list.add(ba3);
        // Call the library sort method
        Collections.sort(list);
        // Print out the sorted list
        for (int i = 0; i < list.size(); i++) {
            BankAccount b = list.get(i);
            System.out.println(b.getBalance());
        }
    }
}