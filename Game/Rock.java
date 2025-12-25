package Game;
// rock paper scissor game
import java.util.*;
public class Rock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
        int userChoice = sc.nextInt();
        Random roud = new Random();
        int computerChoice = roud.nextInt(3); // 0, 1, or 2

        System.out.println("User choice: " + userChoice);
        System.out.println("Computer choice: " + computerChoice);

        if(userChoice == computerChoice){
            System.out.println("It's a tie!");
        } else if((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)){
            System.out.println("User wins!");
        } else {
            System.out.println("Computer wins!");
        }
        sc.close();
    }
    
}
