package Misha;

public class SmallestSubarraySum {
    public int findSmallestSubarray(int arr[], int sum){
        int min_length=arr.length+1;
        for(int i=0;i<arr.length;i++){
            int curr_sum = arr[i];
            if(curr_sum>sum){
                return 1;
            }
            for(int j=i+1;j<arr.length;j++){
                curr_sum=curr_sum+arr[i];
                if(curr_sum>sum && (j - i+1) < min_length)
                min_length=i - j+1;
            }
        }
    
    if (min_length == arr.length + 1) {
        return 0; 
    }
    return min_length;
    }
    public static void main(String[] args) {
        SmallestSubarraySum obj = new SmallestSubarraySum();
        int arr[] = new int[]{1,4,45,6,10,19};
        int sum=51;
        
       int sol =  obj.findSmallestSubarray(arr,sum);

       if (sol > 0) {
        System.out.println("The length of the smallest subarray with sum greater than " + sum + " is: " + sol);
    } else {
        System.out.println("No subarray with sum greater than " + sum + " exists.");
    }
    }
}
