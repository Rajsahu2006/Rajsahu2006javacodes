package Methods.PractiseQ;
//Write a java program to print Multiplication Table of a no. n;
public class Pq1 {
    static void Multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d  = %d\n",n ,i,n*i);

        }

    }
    public static void main(String[] args) {
        Multiplication(4);
    }
    
}
