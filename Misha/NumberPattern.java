package Misha;

public class NumberPattern {
    public static void main(String[] args) {
        int row=4;
        int num=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                System.out.print( num + " ");
                num++;
            
            }
            System.out.println();
        }
    }
    
}