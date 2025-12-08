package IFELSE;
//if else conditions
import java.util.Scanner;

//import practiceQ.scanner;
public class I1 {
    public static void main(String[] args) {
        int age;
        System.out.println("enter a age ");
        Scanner sc = new Scanner(System.in);
        age =sc.nextInt();
        //System.out.println("Enter a age");
        //int age = 88;
        if(age==18){ 
            System.out.println("yes you are a adult");
        }
        //int age =21;
        else if(age<30){
            System.out.println("you are valid for Votting");
        }

        //}
        else if(age>70){
            System.out.println("you are a old man");
        }
        else{
            System.out.println("you are a valid for driving");
        }
    }
    
}
