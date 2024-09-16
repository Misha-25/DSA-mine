package Misha;

public class SearchTargetFromReversedSortedArray{
    public static int FindIndex(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
           return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int result = FindIndex(new int[]{6,5,4,3,2,1}, 2 );
        System.out.println(result);
    }
}

