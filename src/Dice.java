import java.util.Scanner;

public class Dice {

    // int value;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setRandomValue() {
        this.value = (int) (Math.random() * 6) + 1;
    }
    public void rollDice(){
        Scanner in = new Scanner(System.in);

        System.out.println("Press r to roll");
        String input = in.nextLine();
        if (input.equals("r")){
            setRandomValue();
            printDice();
        }


    }

    public void printDice() {
        System.out.println(getValue());
    }

    public void comeOutRoll(){
        System.out.println("This is the come out roll" +
                "\nIf you roll 7 or 11 you win.\nBut if you roll 2,3 or 12" +
                " you lose.");
        rollDice();

        if (this.value==7||this.value==11){
            System.out.println(this.getValue() + " You win!");

        }
    }


}
