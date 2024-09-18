package Misha.String;

public class DuplicateCharacterInString {
    public static void main(String[] args) {
        String str = "MISHAIAsssssSis Such an amazing";
        str = str.toLowerCase();
        int[] count = new int[256];
        for(char c: str.toCharArray()){
            count[c]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>1  && i !=' '){
                System.out.println((char)i + " " + count[i]);
            }

        }
    }
}
