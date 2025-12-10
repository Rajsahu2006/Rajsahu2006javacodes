package Arry.Practise;
// swap two numbers in arry 
// Reverse the arry;
import java.util.*;
public class PR6 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        // math.floorDev = decimal value nhi detha;

        for(int i=0; i<n; i++){
            // a b  temp;
            int temp;
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for ( int element  : arr) {
            System.out.println(element);
        }
    }
    
}
