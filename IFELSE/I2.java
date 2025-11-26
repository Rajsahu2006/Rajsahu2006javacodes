package IFELSE;
import java.util.Scanner;
public class I2 {
    public static void main(String[] args) {
        System.out.println("Enter a month");
        int Date;
        Scanner sc = new Scanner(System.in);
          Date = sc.nextInt();
          switch (Date) {
            case 1:
                System.out.println("Happy new year");
                
                break;
                case 14:
                    System.out.println("Happy Maker Sankaranti");
                    break;
                case 3:
                    System.out.println("Happy Holi");
                    break;
                case 16:
                    System.out.println("HAppy Navratri");
                    break;       
          
            default:
                System.out.println("Happy EAID");
                
                System.out.println("Thanks for read a code ");
                
          }

    }
    
}
