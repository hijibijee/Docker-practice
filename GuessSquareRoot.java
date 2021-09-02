import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class GuessSquareRoot {
    public static void main(String[] args) {
        boolean endGame = false;

        Scanner scn = new Scanner(System.in);

        while(!endGame) {
            Random rand = new Random();
            long ans = rand.nextInt(100) + 5;
            boolean winner = false;
            System.out.println("Tell me the square root of: " + ans * ans);
            for(int attempt_no = 1; attempt_no <= 10; attempt_no++){
                System.out.println("\nAttempt " + attempt_no);
                long user_ans = scn.nextLong();
                if(user_ans < ans) System.out.println("Guess higher...");
                else if(user_ans > ans) System.out.println("Guess lower...");
                else{
                    System.out.println("Bingooo...!!!\n");
                    winner = true;
                    break;
                }
            }

            if(!winner) System.out.println("You failed...    :(\n");

            System.out.println("Press 'y' to end this game.....");
            char gameEnder = scn.next().charAt(0);
            endGame = (gameEnder == 'y');
        }
    }
}
