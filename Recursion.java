package Methods;
//Method Overloading = same class but different perameter;
// Recursion Function;
import java.util.*;
public class Recursion{
    static int factroial(int n){
        if(n==0 || n== 1){
            return 1;
        }
        else{
            return n * factroial(n - 1); 
        }
    }
    static int factroial_iterative(int n){ // Calling of function by itself.

            if(n==0 || n== 1){             // Iteratative Approach,
            return 1;
        }
        else{
        int product = 1;
            for(int i =1; i<=n;i++){
                product *= i;
            }
            return product;
        }

    }
    public static void main(String[] args) {
        int n =5;
        System.out.println("Factorial of n is " + factroial(n));
        System.out.println("Factorial of n is " + factroial_iterative(n));
    }
}