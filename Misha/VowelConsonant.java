package Misha;

public class VowelConsonant {
    public static void main(String[] args) {
        int vowelCount=0;
        int consonantCount=0;
        int specialCharacterCount = 0;
        String str = "Snapchat  Mishu";
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
                vowelCount++;
            }
            else if(ch == ' '||ch=='!'){
                specialCharacterCount++;
            }
            else{
                consonantCount++;
            }
        }
            System.out.println("vowels " + vowelCount);
            System.out.println("consonant " + consonantCount );
            System.out.println("specialchar " + specialCharacterCount);
        
    }
}
