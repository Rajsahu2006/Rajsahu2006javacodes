package IFELSE;
import java.util.Scanner;
public class l7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a website");
        String website = sc.next();
        if ( website.endsWith(".org")){
            System.out.println("This is organizational website");
        }
        else if (website.endsWith(".com")) {
            System.out.println("This is comirical website");
            
        }
        else if (website.endsWith(".in")){
            System.out.println("This is indian website ");
        }
    }
    
}
