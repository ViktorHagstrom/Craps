import java.util.Scanner;

public class Game {


    // int nOfPlayers;

    public void setPlayer(Player player) {
        this.player = player;
    }

    private Player player;

    private int out7;
    private int sum;
    // private String winMess = "\nCongratulations you win!\n" +"You have a total of " + player.getWins();

    public void setSum(Dice dice1, Dice dice2) {
        sum = dice1.getValue() + dice2.getValue();
    }

    private int pN; // point number

    public void setPN(int pN) {
        this.pN = pN;
    }


    // int out7 = 7;
    // int[] winCon = 7,11;
    // int failCon[] = 2,3,12;
    // boolean winFailCon = false;
    private boolean winCon;

    public void setWinCon(boolean winCon) {
        this.winCon = winCon;
    }

    private boolean failCon;

    public void setFailCon(boolean failCon) {
        this.failCon = failCon;
    }

    // Set number and names of players
    // Set player positions
    // Chose starting player"shooter"(p1)
    // Come out roll, p1 rolls (if roll == 7||11)-p1 and players that bet on him wins,
    //      if(roll == 2||3||12) p1 loses and the player player who bet against win
    // Set point number(pN), point number cannot be 2,3,7,11 or 12. In streets craps the result of the come ot roll is the pN
    // p1 rolls, the goal is to hit pN before he rolls a 7(Out 7). if(p1 rolls 7 before hitting pN) p1 loses.
    // Loop until pN or 7

    // "Welcome to the world series of craps"
    // "Who are you?" create player
    // come out roll click to roll
    // check for win/fail conditions

    public void startGame() {
        Scanner in = new Scanner(System.in);
        Player player = Player.getInstance();
        setPlayer(player);
        try {
            System.out.println("Welcome to the World Series of Craps!\n" +
                    "Please enter your name");
            player.setName(in.next());

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Welcome " + player.getName());
    }

    public void comeOutRoll(Dice dice1, Dice dice2) {

        System.out.println("This is the come out roll" +
                "\nIf you roll 7 or 11 you win.\nBut if you roll 2,3 or 12" +
                " you lose.");
        dice1.rollDice();
        dice2.rollDice();
        setSum(dice1, dice2);

        // if (winCon.contains(roll)) player wins, npcs that bet 1 wins
        if (sum == 7 || sum == 11) {
            System.out.println(sum + " You win!");
            setWinCon(true);
            player.playerWin();

        }
        // if (failCon.contains(roll)) player loses, npcs with bet 2 wins
        else if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println(sum + " You lose!");
            setFailCon(true);
            player.playerLose();

        }
        // else set pN // cannot be winCon or failCon
        else {
            System.out.println(sum + " this is your point number, hit this to win");
            setPN(sum);
        }
    }

    public void rollDices(Dice dice1, Dice dice2) {

        Scanner input = new Scanner(System.in);
        // while (roll != out7 || roll != pN )
        String uInput = "J";
        while (true) {
            // click to roll
            dice1.rollDice();
            dice2.rollDice();
            setSum(dice1, dice2);

            // if(roll == pN)
            // player and npcs that bet 1 win
            if (sum == pN) {
                System.out.println("Congratulations you win!\n" +
                        "You have a total of " + player.getWins() + " wins and "
                        + player.getLoses() + " loses.");
                setWinCon(true);
                player.playerWin();
                break;
            }
            // if(roll == out7)
            else if (sum == 7) {
                System.out.println("You rolled the out 7, you lose");
                // player loses, npcs that bet 2 wins
                setFailCon(true);
                player.playerLose();
                break;
            } else {
                System.out.println(sum + " You need to hit " + pN +
                        " to win." + " Continue rolling");
            }



        }


    }


    // play again?


}
