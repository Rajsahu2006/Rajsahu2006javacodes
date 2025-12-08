package IFELSE;
import java.util.Scanner;

import practiceQ.scanner;
public class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        byte m1,m2,m3;
        System.out.println("Enter a  marks in physics  ");
        m1 = sc.nextByte();
        System.out.println("Enter a marks in chemestry");
        m2 = sc.nextByte();
        System.out.println("Enter a marks in maths ");
        m3 = sc.nextByte();
        float avg  = (m1+m2+m3)/3.0f;
        System.out.println("Your overall persentage is" + avg);
        if(avg>=40 && m1>= 30 && m2>= 30 && m3>=30){
            System.out.println(" you are passed");
        }
        else{
            System.out.println(" you are fail");
        }

    }
    
}
