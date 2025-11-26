package lac4;
import java.util.ArrayList;
import java.util.LinkedList;
class list {
    
    public static void main(String[] args) {
            ArrayList<Integer>list = new ArrayList<>();
            list.add(5);
            list.add(10);
            list.add(1,30);
            System.out.println(list);
            list.add(34);
            list.add(70);
            System.out.println(list);

        
        //LinkedList<Integer> llist = new LinkedList<>();
        for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i));
    }
        for(int num:list){
            System.out.println(num);
        }
    } 
}

