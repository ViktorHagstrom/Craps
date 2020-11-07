public class Game {



    // int nOfPlayers;
    private int pN; // point number
    public void setPN(int pN) {
        this.pN = pN;
    }
    // int out7 = 7;
    // int[] winCon = 7,11;
    // int failCon[] = 2,3,12;
    // boolean winFailCon = false;

    // Set number and names of players
    // Set player positions
    // Chose starting player"shooter"(p1)
    // Come out roll, p1 rolls (if roll == 7||11)-p1 and players that bet on him wins,
    //      if(roll == 2||3||12) p1 loses and the player player who bet against win
    // Set point number(pN), point number cannot be 2,3,7,11 or 12. In streets craps the result of the come ot roll is the pN
    // p1 rolls, the goal is to hit pN before he rolls a 7(Out 7). if(p1 rolls 7 before hitting pN) p1 loses.
    // Loop until pN or 7

    // "Welcome to the world series of craps"
    // setNOfPlayers();
    // "Who are you?" create player
    // give npcs generic names( Player2,3 etc)
    // choose shooter, set boolean shooter to true for that player, player will always be shooter for now
    // npcs(non player controlled) places bets randomizes 1 or 2(1 player wins, 2 player loses)
    // create 2 dices

    // come out roll click to roll
    // check for win/fail conditions
    public void comeOutRoll(Dice dice1,Dice dice2){
        // todo make this work for 2 dice
        System.out.println("This is the come out roll" +
                "\nIf you roll 7 or 11 you win.\nBut if you roll 2,3 or 12" +
                " you lose.");
        dice1.rollDice();
        dice2.rollDice();
        int sum =dice1.getValue() + dice2.getValue();

        // if (winCon.contains(roll)) player wins, npcs that bet 1 wins
        if (sum==7||sum==11){
            System.out.println(sum + " You win!");

        }
        // if (failCon.contains(roll)) player loses, npcs with bet 2 wins
        else if (sum==2||sum==3||sum==12){
            System.out.println(sum + " You lose!");
        }
        // else set pN // cannot be winCon or failCon
        else{
            System.out.println(sum + " this is your point number, hit this to win");
            setPN(sum);
        }
    }




    // while (roll != out7 || roll != pN )
    // click to roll
    // if(roll == out7)
    // player loses, npcs that bet 2 wins
    // if(roll == pN)
    // player and npcs that bet 1 win
    // play again?


}
