package Misha.String;

public class StringRotation {
    static boolean areRotaions(String str1, String str2){
        return(str1.length() == str2.length()) && ((str1+str2).indexOf(str2) != -1);

    }
    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDE";
        if(areRotaions(str1,str2)){
            System.out.println("Yes are rotation");
        }
        else{
            System.out.println("No aren't rotation");
        }
    }
}
