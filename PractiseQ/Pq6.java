package Methods.PractiseQ;
// pattern using  Recursion;
public class Pq6 {
    static void Pattern(int n){
        if(n>0){
            Pattern(n -1);
            for(int i =0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(5);
    }
    
}
