package Misha.String;
public class New{
public static void main(String args[]){
    String str="aabbbccc";
    char[] c = str.toCharArray();
    int arrCount[] = new int[c.length];
    int count=0;

    for(int i=0; i<c.length;i++){
       for(int j=i+1;j<c.length;j++) {
        
        if(c[i]==c[j]){
            count++;
        }
    }
        arrCount[i] = count;
    }
        for(int i=0;i<c.length;i++){

        
           System.out.println(" " + arrCount[i]);
        }
    }
}


            
           
        


        


