package Misha;

public class TripletSum {
    boolean  findTriplet(int arr[], int sum){
        for(int i=0; i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        System.out.println("Triplet is " + arr[i] + " ," + arr[j] + "," + arr[k]);
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TripletSum triplet = new TripletSum();
        int arr[] = new int[]{1,4,45,6,10,8};
        int sum = 22;
      triplet.findTriplet( arr, sum);
    }
}
