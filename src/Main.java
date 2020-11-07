import java.util.Dictionary;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        Player p1 = new Player();
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        game.comeOutRoll(d1,d2);
        game.rollDices(d1,d2);



        // d1.setRandomValue();
        //d1.printDice();
        // d1.printDice();
       // d1.setValue(7);
       // d1.comeOutRoll(d1,d2);

        //d1.rollDice();




    }


}
