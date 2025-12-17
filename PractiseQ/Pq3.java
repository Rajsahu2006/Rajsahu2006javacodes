package Methods.PractiseQ;
// patern Qu;
public class Pq3 {
    static void patern(int n){
        if(n>0){
            for(int i= n; i>=1;i--){
                System.out.print("*");
            }
            System.out.println();
            patern(n-1);
        }
    }
    public static void main(String[] args) {
        patern(6);
    }
    
}

