import java.util.Random;
import java.util.Scanner;

class Game{
    int myRandInt;
    int chances = 0;
    Game() {
        Random randI = new Random();
        this.myRandInt = randI.nextInt(100);
        this.myRandInt++;
        System.out.println("Guess Number ! ");
    }

    void playGame()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == myRandInt) {
            System.out.format("Correct !! took you %d chances", chances);
            return;
        }
        else if(num < myRandInt)
        {
            System.out.println("Guess higher ! ");
        }
        else System.out.println("Guess lower ! ");

        this.chances++;
        this.playGame();
    }


}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.playGame();
    }
}
