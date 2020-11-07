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

        while (true)
        try {
            System.out.println("Press r to roll");
            String input = in.nextLine();

            if (input.equals("r")){
                setRandomValue();
                printDice();

                break;
            }
            else{
                System.out.println("Incorrect input.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void printDice() {
        System.out.println(getValue());
    }




}
