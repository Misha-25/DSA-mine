package Misha.String;

import java.util.Scanner;

public class FirstLetterUserInput {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter first name");
 String first = sc.nextLine();
 System.out.println("enter last name");
 String last = sc.nextLine();
 String initials = first.substring(4,5) + " " + last.substring(8,9);
 System.out.println(initials);  
 sc.close();     
    }
}

