/**
 * Created by Viktor Hagström
 * Date: 2020-11-6
 * Time:
 * Project: Craps
 * Copyright: MIT
 */
import java.util.Scanner;

public class Dice {

    private int value;
    private String name;

    /**
     * Gets the given name for the dice
     * @return dice name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name for the dice
     * @param name dice name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the value of a dice
     * @return dices value
     */
    public int getValue() {
        return value;
    }

    /*
    /**
     * Sets the value of a dice
     * @param value the value to be set
     *//*
    public void setValue(int value) {this.value = value;} //used for testing
    */

    /**
     * Sets a random value to a dice
     */
    public void setRandomValue() {
        this.value = (int) (Math.random() * 6) + 1;
    }

    /**
     * Rolls a dice through interaction with user and prints out the value
     */
    public void rollDice() {
        Scanner in = new Scanner(System.in);

        while (true)
            try {
                System.out.println("\nPress r to roll " + this.getName());
                String input = in.nextLine();

                if (input.equalsIgnoreCase("r")) {
                    setRandomValue();
                    printDice();

                    break;
                } else {
                    System.out.println("Incorrect input.");
                }
            } catch (Exception e) {
                e.printStackTrace();

            }
    }

    /**
     * Prints the value of a dice
     */
    public void printDice() {
        System.out.println("You rolled " + getValue());
    }
}
