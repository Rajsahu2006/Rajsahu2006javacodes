package lact5;
import java.util.*;
public class Has {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(2, 48);
        map.put(3, 88);
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(6, null));
        for(int x :map.keySet()){
            System.out.println(map.get(x));
        }
    }
    
}
