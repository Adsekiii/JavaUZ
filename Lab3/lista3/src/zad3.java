
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class zad3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int x = rand.nextInt(200) + 1;
        int guess = -1;

        while(guess != x){
            System.out.println("Guess a number between 1 and 200");
            guess = in.nextInt();
            if(guess == x){
                System.out.println("Congratulations! You guessed it!");
            }
            else if (guess < x){
                System.out.println("Too low!");
            }
            else if (guess > x) {
                System.out.println("Too high!");
            }

        }

        in.close();
    }
}
