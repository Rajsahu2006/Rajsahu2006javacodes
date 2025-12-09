package Lact19;

public class try1 {
    public static void main(String[] args) {
        try {
            voteage(16);
        } catch (Exception e) {
            //voteage(19);
            System.out.println("exception occurred");
            System.out.println(e);
            voteage(19);
            
            // TODO: handle exception

        }
    }
    static void voteage(int age){
        System.out.println("check for vote");
        if(age<=18){
            throw new ArithmeticException("valid for vote"); 
        
        }
        else{
            System.out.println("not a valid age for voting");
        }
    }
    //    voteage(18);
}
    


    

