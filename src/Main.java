import java.util.Dictionary;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        game.startGame();
        while (true) {

            game.comeOutRoll(d1, d2);
            game.rollDices(d1, d2);
            System.out.println("Play again?");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            in.nextLine();
            if (input.equalsIgnoreCase("J")){
                System.out.println();
            }
            else break;



        }



        // d1.setRandomValue();
        //d1.printDice();
        // d1.printDice();
        // d1.setValue(7);
        // d1.comeOutRoll(d1,d2);

        //d1.rollDice();


    }


}
