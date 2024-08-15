package Misha;

import java.util.Arrays;

public class MakeTwoArrayEqual {
    public static boolean canbeEqual (int target[], int arr[]){
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
    public static void main(String[] args) {
        boolean solution =  canbeEqual(new int[]{1,2,3,4}, new int[]{2,4,1,11});
        System.out.println(solution);
    }
    
}
