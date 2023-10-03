public class Main {
    public static void main(String[] args) {
        System.out.println("ØVING 4 OPPGAVE 2: TERNINGKAST");
        Player[] playerList = createPlayers(20);

        boolean playerHasWon = false;
        int round = 1;
        while (!playerHasWon) {
            System.out.println("Round " + round);
            for (Player player : playerList) {
                int result = player.throwDice();
                System.out.println("Player " + (player.getId() + 1) + ", throws dice: " + result + ", sum: " + player.getSumPoints());
                //System.out.println("Sum of points: " + player.getSumPoints());

                playerHasWon = player.isDone();
                if (playerHasWon) {
                    break;
                }
            }

            System.out.println();
            round++;
        }

        System.out.println("Program avslutt");
    }



    public static Player[] createPlayers(int numberOfPlayers) {
        Player[] list = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            list[i] = new Player(i);
            System.out.println("Created Player " + (i + 1));
        }
        System.out.println();

        return list;
    }
}