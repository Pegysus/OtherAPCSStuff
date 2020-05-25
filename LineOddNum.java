public class LineOddNum {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int dash = 0; dash < (5 - i); dash++) {
                System.out.print("-");
            }
            for(int num = 0; num < 2*i + 1; num++) {
                System.out.print(2*i + 1);
            }
            for(int dash = 0; dash < (5 - i); dash++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}