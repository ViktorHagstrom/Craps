/**
 * Created by Viktor Hagström
 * Date: 2020-11-6
 * Time:
 * Project: Craps
 * Copyright: MIT
 */
import java.util.Scanner;

public class Game {

    private final int OUT7 = 7;
    private int sum;
    private final String LMESSAGE = "\nYou lose!";
    private final String WINMESSAGE = "\nCongratulations you win!";
    private int pN; // point number
    private Player player;
    private boolean exit = false;

    /**
     * checks value of exit
     *
     * @return true or false
     */
    public boolean isExit() {
        return exit;
    }

    /**
     * Sets the value of boolean exit
     *
     * @param exit true or false
     */
    public void setExit(boolean exit) {
        this.exit = exit;
    }

    /**
     * Calculates the total of dice rolls
     *
     * @param dice1 first Dice
     * @param dice2 second Dice
     */
    public void setSum(Dice dice1, Dice dice2) {
        sum = dice1.getValue() + dice2.getValue();
    }

    /**
     * Sets the player to this game
     *
     * @param player the Player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Sets point number
     *
     * @param pN point number
     */
    public void setPN(int pN) {
        this.pN = pN;
    }

    // int out7 = 7;
    // int[] winCon = 7,11;
    // int failCon[] = 2,3,12;
    // boolean winFailCon = false;
    // "Welcome to the world series of craps"
    // "Who are you?" create player
    // come out roll click to roll
    // Come out roll, p1 rolls (if roll == 7||11)-p1 and players that bet on him wins,
    //      if(roll == 2||3||12) p1 loses and the player player who bet against win
    // Set point number(pN), point number cannot be 2,3,7,11 or 12. In streets craps the result of the come ot roll is the pN
    // p1 rolls, the goal is to hit pN before he rolls a 7(Out 7). if(p1 rolls 7 before hitting pN) p1 loses.
    // Loop until pN or 7


    /**
     * The start of a game
     */
    public void startGame() {
        Scanner in = new Scanner(System.in);
        Player player = Player.getInstance();
        setPlayer(player);

        try {

            System.out.println("\t\u2680\t\u2681\t\u2682\t\u2683\t\u2684\t\u2685" +
                    "\nWelcome to the World Series of Craps!\n" +
                    "Please enter your name");

            player.setName(in.nextLine());

        } catch (Exception e) {
            e.printStackTrace();
            setExit(true);
        }
        System.out.println("Welcome " + player.getName() + "\n");
    }

    /**
     *
     */
    public void endGame() {
        System.out.println("Thank you for playing!\n" +
                "Your final score is " + player.getWins() + " wins and " + player.getLoses() + " loses.");
    }

    /**
     * The come out roll decides if the player gets a quick win or loss if not it sets the point number
     *
     * @param dice1 first dice
     * @param dice2 second dice
     */
    public void comeOutRoll(Dice dice1, Dice dice2) {

        setExit(false);
        System.out.println("***This is the come out roll***" +
                "\nIf you roll 7 or 11 you win.\nBut if you roll 2,3 or 12" +
                " you lose.");
        dice1.rollDice();
        dice2.rollDice();
        setSum(dice1, dice2);

        // if (winCon.contains(roll)) player wins, npcs that bet 1 wins

        if (sum == OUT7 || sum == 11) {
            player.playerWin();
            System.out.println("Your total is " + sum + WINMESSAGE +
                    "\nYou have a total of " + player.getWins() + " wins and "
                    + player.getLoses() + " loses.");
            setExit(true);

        }
        // if (failCon.contains(roll)) player loses, npcs with bet 2 wins
        else if (sum == 2 || sum == 3 || sum == 12) {
            player.playerLose();
            System.out.println("Your total is " + sum + LMESSAGE + "\nYou have a total of " + player.getWins() + " wins and "
                    + player.getLoses() + " loses.");

            setExit(true);

        }
        // else set pN // cannot be winCon or failCon
        else {
            System.out.println("\nYour total is " + sum + " this is your point number, hit this to win");
            setPN(sum);
        }
    }

    /**
     * The main body of the game, roll dices, calculate sum and update score
     *
     * @param dice1 first Dice
     * @param dice2 second Dice
     */
    public void rollDices(Dice dice1, Dice dice2) {

        while (true) {
            // click to roll
            dice1.rollDice();
            dice2.rollDice();
            setSum(dice1, dice2);

            // if(roll == pN)
            // player and npcs that bet 1 win
            if (sum == pN) {
                player.playerWin();
                System.out.println("You rolled " + sum + WINMESSAGE +
                        "\nYou have a total of " + player.getWins() + " wins and "
                        + player.getLoses() + " loses.");
                break;
            }
            // if(roll == out7)
            else if (sum == OUT7) {
                player.playerLose();
                System.out.println("You hit the out 7." + LMESSAGE + "\nYou have a total of " + player.getWins()
                        + " wins and " + player.getLoses() + " loses.");

                break;
            } else {
                System.out.println("\nYour total roll is " + sum + "\nYou need to hit " + pN +
                        " to win." + "\n\nContinue rolling\n");
            }


        }

    }

}
