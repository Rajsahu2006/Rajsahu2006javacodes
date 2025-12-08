package Lact6;
//ITERATOR  METHOD
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>(); //iterator = moving the arrylist like 2 se 4 se 6...
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(9);
        ListIterator<Integer>it = list.listIterator(); //it is a variable
        while (it.hasNext()) {
            Integer x =it.next();
            System.out.println(list);
            if(x==4);
            it.set(10);
            
        }
        

        
    }
    
}
