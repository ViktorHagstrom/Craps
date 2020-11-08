public class Player {


    private String name;
    private int wins;
    private int loses;

    /**
     * Creates a new player
     * @return the created player
     */
    public static Player getInstance(){
        Player player = new Player();
        return player;
    }

    /**
     * Gets the name of a player
     * @return player name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the amount of wins of a player
     * @return number of wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * Gets the amount of loses of a player
     * @return number of loses
     */
    public int getLoses() {
        return loses;
    }

    /**
     * Sets the player name
     * @param name players name
     */
    public void setName(String name) {
        this.name = name; }

    /**
     * Updates player wins
     */
    public void playerWin(){
        this.wins += 1;
    }

    /**
     * Updates player loses
     */
    public void playerLose(){
        this.loses +=1;
    }


}

