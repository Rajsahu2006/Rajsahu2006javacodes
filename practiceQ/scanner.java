package practiceQ;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        System.out.println("taking input by user");
        Scanner pc=new Scanner(System.in);
        System.out.println("enter number1");//scanner class
        int a =pc.nextInt();//calling
        System.out.println("enter number 2");
        int b =pc.nextInt();//calling
        int sum = a+b;
        System.out.println("the sum of these number is");
        System.out.println(sum);
    }
    
}
