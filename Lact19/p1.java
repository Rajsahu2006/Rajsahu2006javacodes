package Lact19;

public class p1 {
    public static void main(String[] args) {
        int arr[] = {5,-3,0,6,3,7};
        for(int i=0;i<=7;i++){
            int sum =0;  // slide window
            for(int j =i;j<=7;j++){
                sum += arr[j];
                System.out.println(sum);
            }
        }
    }
    
}
