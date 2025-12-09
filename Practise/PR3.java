package Arry.Practise;
 // Average of this array 
public class PR3 {
    public static void main(String[] args) {
        
    
    int Marks [] = {56,45,78,44,74,60};
    int sum = 0 ;
    
    for(int element : Marks){
        sum = sum + element;

    }
    System.out.println("The average of this no. in physics is " +sum/ Marks.length);

    }
}
