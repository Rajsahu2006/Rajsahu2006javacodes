package Game;

import java.util.Scanner;

/*"GUESS THE NUMBER" */
/*used constructor to generate Random number ,
used Setnum() to set a number,
used isCorrect() method to check,
used Counter() to count the number of Guesses*/
class Game{
    int usernumber;
    int Computernumber;
    int counter =0;
    //create a constructor;
    public Game(){
        Computernumber =(int) (Math.random()*100);
        System.out.println(Computernumber);
      
    }
    public void setNumber(int n){
        usernumber = n;

    }
    public int isCorrect(){
        if(usernumber<Computernumber)
            return -1;
        else if(usernumber>Computernumber)
            return 1;
        else 
            return 0;
    }
    public void counter(){
        counter++;
    }


}


public class Game2 {
    public static void main(String[] args) {
        Game obj = new Game();
        Scanner sc = new Scanner(System.in);
        int n=0;
        while (true) {
            System.out.println("Entera number between 1 to 100");
            n = sc.nextInt();
            obj.setNumber(n);

            if(obj.isCorrect() == 0){
                System.out.println("Congrulations you have right gussed the number");
                System.out.println("Number of counts :" + (obj.counter));
                break;
            }
            else if(obj.isCorrect()== -1){
                System.out.println("Lower Number please !");
            }
            else if(obj.isCorrect()== 1){
                System.out.println("Higher number please!");
            }
            else{
                System.out.println("Defaultn Number !");
            }
            
        }
    }
    
}
