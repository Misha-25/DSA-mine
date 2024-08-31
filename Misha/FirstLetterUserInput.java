package Misha;

import java.util.Scanner;

public class FirstLetterUserInput {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter first name");
 String first = sc.nextLine();
 System.out.println("enter last name");
 String last = sc.nextLine();
 String initials = first.substring(0,1) + " " + last.substring(0,1);
 System.out.println(initials);  
 sc.close();     
    }
}
