package OPERATORS;

import javax.sql.rowset.spi.SyncResolver;

public class increment {
    public static void main(String[] args) {
        char grade ='B';
        //encrapt the Grade 
        grade = (char)(grade +8);
        System.out.println(grade);
    
     grade = (char)(grade -8);
     //decrement grade
     System .out .println(grade);
    }
    

}
