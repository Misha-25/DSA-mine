package Misha.String;

public class CharacterOccurence {
    public static void main(String[] args) {
        
    
    String input = "aaabbbbbbccccccccccc";
    int countA=0;
    int countB=0;
    int countC=0;
    for(char ch : input.toCharArray()){
        switch (ch) {
            case 'a' :
            countA++;
            break;
            case 'b' :
         
           
           
            countB++;
            break;
            case 'c' :
            countC++;
                
                break;
        
            default:
                break;
        }
    }
    System.out.println("occurence of a " + countA);
    System.out.println("occurence of b " + countB);
    System.out.println("occurence of c " + countC);
    
    
}
}
