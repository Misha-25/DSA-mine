package Misha;

public class SearchKeyValueFromArray {
    public static int 
    SearchValue(int arr[], int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return value;
            }
        }
        return -1;
    }
    

public static void main(String[] args) {
    int sol = SearchValue(new int[]{12,24,36,56,78,90},36);
    System.out.println(sol);
}
}

