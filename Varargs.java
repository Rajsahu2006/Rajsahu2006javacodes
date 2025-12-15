package Methods;

public class Varargs {
    static int sum(int ...arr){ // special function (Varargs); 
        int result =0;          // Create Array;
        for(int a: arr){
            result +=a;

        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Sum of 2,3 and 6 is " + sum(2,2,6));
        System.out.println("sum of these no. is " + sum(6,3,4 ));
    }
    
}
