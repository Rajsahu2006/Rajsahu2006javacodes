package Methods.PractiseQ;

import java.util.Scanner;

// Convert temperature to Fahrenheit;
public class Pq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsious : " );
        double Celsious = sc.nextDouble();
        double Fahrenheit = (Celsious *9/5) + 32;                    //Formula ;
        System.out.println("Temperature in Fahrenheit :" + Fahrenheit);
        sc.close();
    }
    
}
