package Misha;
public class Pattern {
    public static void main(String[] args) {
        int row = 5;
        int column = 9;

        for (int i = 0; i < row; i++) {
        for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            
            for (int j = 0; j < column-2*i; j++) {
                System.out.print("* ");
            }

            System.out.println();
 }
}
}
