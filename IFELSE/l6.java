package IFELSE;
import java.util.Scanner;
public class l6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in );
        System.out.println("Enter a year");
        int  year = sc.nextInt();
        if((year % 4 == 0 && year  % 100 != 0) || (year % 400 == 0)){ // Leap year condition 
            System.out.println(year + "It is leap Year");//like 2024 is leap year, 2000 also
        }
        else{
            System.out.println( year +" it is not leap year");
        }

    }
    
}
