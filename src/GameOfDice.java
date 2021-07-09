/*Begin
    Prompt user to roll dice
    Get score
    If
        a single number 1 is thrown on either die
    Then
        the score for that whole turn is lost
        prompt user to roll the dice
    If
        a double 1 is thrown
    Then
        25 points are added to running total
        prompt user to roll the dice
     If
        a single number >=2 are thrown on both die during a throw
        the sum of the throw will be added to the running score
        prompt user to roll the dice
     Else
        when user reaches a score of >=100 end the game
 */


import java.util.Random;
import java.util.Scanner;
public class GameOfDice {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Let's Play Roll Dice!");

        System.out.println("Please roll the dice");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your rolls");

        int score = keyboard.nextInt();
        if (score == 1)
            System.out.println("The score for the whole turn is lost");
        int snake eyes = keyboard.nextInt()
        else if (score == snake eyes)
        System.out.println("25 points are added to your running score");





        int score = keyboard.nextInt();




    }
}
