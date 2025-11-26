package lact5;
import java.util.*;
public class has2 {
    public static void main(String[] args) {
        
    
    HashMap<Integer,Integer> map = new HashMap<>();
    int arr[] = {2,2,3,4,2,4,2};
    for(int x :arr){ 
        map.put(x , map.getOrDefault(x, 0) + 1);
    }
    // char arr[] = {'a','a','d','e','o','o'};
    // for(char x :arr){
    // map.put(1, map.getOrDefault(x, 0)+1 );
    // }

    //System.out.println(map);
    String str ="aabksedd";
    HashMap<Character,Integer>map11= new HashMap<>();
    for(char ch :str.toCharArray()){
        map11.put(ch, map11.getOrDefault(ch, 0) + 1);

    }
    System.out.println(map11);
    for(char ch :str.toCharArray()){
        if (map11.get(ch)==1){
            System.out.println(ch);
            break;
        }
    }
    }
}
