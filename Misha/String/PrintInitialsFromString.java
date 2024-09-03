package Misha.String;

import java.util.Scanner;

public class PrintInitialsFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] sm= str.split(" ");
        for(String strng:sm){
            System.out.println(strng.charAt(0));
            sc.close();
        }
    }
}
