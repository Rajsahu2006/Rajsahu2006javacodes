package IFELSE;
import java.util.*;
public class l5 {
    //Enhance Switch Case 
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  1 to 7");
        int Day;
        Scanner sc = new Scanner(System.in);
        Day = sc.nextInt();
        switch (Day) {
        //     case 1:
        //     System.out.println("The day is Monday");
                
        //         break;
        //         case 2:
        //             System.out.println("The day is Tuesday");
        //             break;
        //             case 3:
        //                 System.out.println("The day is Wednesday");
        //                 break;
        //                 case 4:
        //                     System.out.println("The day is Thursday");
        //                     break;
        //                     case 5:
        //                         System.out.println("The Day is Friday");
        //                         break;
        //                         case 6:
        //                             System.out.println("The day is Saturday");
        //                             break;
        //                             case 7:
        //                                 System.out.println("The is Sunday ");
        //                                 break;
        
        //     default:
        //         System.out.println("This is your Day");
        //         break;
        case 1 -> System.out.println("Monday");// enhance Switch Case
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        }
        
        

    }

    
}
