package Arry.Practise;
//  Find out a given integger is present in Array
public class PR2 {
    public static void main(String[] args) {
        float arr[] = {1.2f,9.3f,6.8f,3.4f,8.5f};
        float num = 2.5f;
        boolean isInArray = false; // it is a function
        for(float element : arr){ // For each loop
            if(num == element){ // Main condition
                isInArray = true;
                break;
            }

        }
        if(isInArray){
            System.out.println("The value is  present in this Array");
        }
        else{
            System.out.println("The value is not present in the Array");
        }
        
        
    }
    
}
