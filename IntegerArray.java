public class IntegerArray {
    public static void main(String[] args) {
        int array[] = new int[10];
        for(int i = 1; i <= array.length; i++) {
            array[i-1] = 2*i;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int counter = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}