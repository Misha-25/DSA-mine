package Misha.String;

public class StringReverse {
    public static void main(String[] args) {
       
        String str = "MIsha Shambhavi";
    
    StringBuilder str1 = new StringBuilder();
    str1.append(str);
    str1.reverse();
    System.out.println(str1);
    }
   
}
