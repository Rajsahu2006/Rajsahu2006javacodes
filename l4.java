package IFELSE;
import java .util.*;

import practiceQ.scanner;
public class l4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per Annum ");
        float Tax = 0;
        float Income = (sc.nextFloat());
        //System.out.println("Enter your income ");
        if (Income<2.5f){
            Tax = Tax + 0;

        }
        else if (Income> 2.5f && Income<=5f) {
            Tax = Tax + 0.05f *(Income - 2.5f); 
            
        }
        else if (Income > 5f && Income<=10f){
            Tax = Tax + 0.05f *(Income - 2.5f); 
            Tax = Tax + 0.2f *(Income - 5f); 
            
        }
        else if (Income>=10f){
            Tax = Tax + 0.05f *(Income - 2.5f); 
            Tax = Tax + 0.2f *(Income - 5f); 
            Tax = Tax + 0.3f *(Income - 10f); 
        }
        System.out.println("Total Tax paid by employs is " + Tax);

    }

    
}
