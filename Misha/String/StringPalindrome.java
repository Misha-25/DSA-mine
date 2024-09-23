
package Misha.String;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        StringBuilder str1 = new StringBuilder(str);
        
        if(str.equalsIgnoreCase(str1.reverse().toString())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
