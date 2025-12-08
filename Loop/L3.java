package Loop;

public class L3 {
    //Break and continue Statement in Loop
    public static void main(String[] args) {
        int i= 6;
        while (i<10) {
            i++;
            //System.out.println(i);
            if(i==9){
                System.out.println("ending the loop");
                //break;
                continue;
            //System.out.println(i);
            }
            System.out.println(i);
            //i++;
            
        }
    }
    
}
