package Methods.PractiseQ;

import practiceQ.sum;

//Reqursive function to calculate sum of n numbers;
public class Pq2 {
    
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
    int c = sum (3);
    System.out.println(c);
    }
    
}
