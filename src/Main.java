/**
 * Created by Viktor Hagström
 * Date: 2020-11-6
 * Time:
 * Project: Craps
 * Copyright: MIT
 */
import java.io.IOException;
import java.util.Dictionary;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        Dice d1 = new Dice();
        d1.setName("Dice 1");
        Dice d2 = new Dice();
        d2.setName("Dice 2");

        game.startGame();
        while (true) {

            game.comeOutRoll(d1, d2);
            if (game.isExit() == false){
                try {
                    game.rollDices(d1, d2);
                } catch (NoSuchElementException e) {
                    e.printStackTrace();
                }
            }
            try {
                System.out.println("\nPress J to play again, any other key will finish the game.");
                Scanner in = new Scanner(System.in);
                String input = in.nextLine();
                if (input.equalsIgnoreCase("J")){
                    System.out.println();
                }
                else{
                    break;
                }
            } catch (NoSuchElementException e) {
                e.printStackTrace();
            }
        }
        game.endGame();

    }
}


