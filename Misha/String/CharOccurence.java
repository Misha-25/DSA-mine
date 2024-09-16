package Misha.String;

public class CharOccurence {
    public static void main(String[] args) {
        System.out.println("find occurence");
        String str = "aaaaabbbbcccccccd";
        int[] count = new int[256];
        for(char c:str.toCharArray()){
            count[c]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println((char) i + ":" + count[i]);
            }
        }
    }
}
