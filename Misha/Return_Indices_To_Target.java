package Misha;

public class Return_Indices_To_Target {
 public static int[] findIndices(int arr[], int target){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                return new int[] {i,j};
            }
        }
    }
    return new int[] {-1,-1};
 }
 public static void main(String[] args) {
   int[] result1 = findIndices(new int[]{3,2,4}, 6);
   System.out.println("Indices: [" + result1[0] + " , " + result1[1] +"]");
 }
}