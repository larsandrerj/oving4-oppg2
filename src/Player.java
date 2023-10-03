import java.util.Random;

public class Player {
    private final int id;
    private int sumPoints = 0;
    Random dice = new Random();

    public Player(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
    public int getSumPoints() {
        return this.sumPoints;
    }

    public int throwDice() {
        int diceThrow = dice.nextInt(6) + 1;
        if (diceThrow == 1) {
            this.sumPoints = 0;
            //System.out.println("RIP XDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXDXD");
            return diceThrow;
        }

        if (this.sumPoints > 100) {
            this.sumPoints -= diceThrow;
            //System.out.println("BRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUHBRUH");
        } else {
            this.sumPoints += diceThrow;
        }
        return diceThrow;

    }

    public boolean isDone() {
        if (this.sumPoints == 100) {
            System.out.println("\nPlayer " + (this.id + 1) +  " has won");
            return true;
        }
        return false;
    }
}
