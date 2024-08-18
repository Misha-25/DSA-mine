package Misha;

public class Pattern2 {
    public static void main(String[] args) {
        
    
    int row=5;
    int column=9;
    for(int i=row-1;i>=0;i--){
        for(int j=i-1;j>=0;j--){
            System.out.print(" ");
        }
        for(int j=column-2*i-1;j>=0;j--){
            System.out.print("*");
        }
        System.out.println();
}
}
}
