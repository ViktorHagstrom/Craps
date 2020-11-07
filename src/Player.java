public class Player {
    public String getName() {
        return name;
    }

    // String name;
    private String name;

    private int wins;
    private int loses;

    public int[] getScore() {
        return score;
    }

    public static Player getInstance(){
        Player player = new Player();
        return player;
    }
    private int[] score = {wins,loses};

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    // set playerName();
    public void setName(String name) {
        this.name = name; }

    public void playerWin(){
        this.wins += 1;
    }

    public void playerLose(){
        this.loses +=1;
    }


}

