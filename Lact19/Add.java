package Lact19;

import java.util.ArrayList;
import java.util.ListIterator;

public class Add {
    public static void main(String[] args) {
        System.out.println("start point");
        try { // it is used to handle the exception
             int a = 7;//code try kar sakte ha 
        int b = 0;
        int c = a/b;
        System.out.println(c);
        // int arr[] = {1,2,3,4};
        // System.out.println(arr[3]);
        } catch (Exception e) { //right code likhna ha 
            
        int arr[] = {1,2,3,4};
        System.out.println(arr[3]);
            // TODO: handle exception
        }finally{
            System.out.println("hamesa chalna chiye ");
        }

        // int a = 7;
        // int b = 0;
        // int c = a/b;
        // System.out.println(c);
        System.out.println("complete the code");
        
    
}

}
    

