import java.util.Scanner;

public class GameEngine {
    private int totalSticks;
    private Scanner input;
    private int gameType;

    public GameEngine() {
        this.input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        GameEngine engine = new GameEngine();
        engine.launchGame();
    }

    public void launchGame() {
        determineGameSetUp();

    }

    private void determineGameSetUp() {
        System.out.println("Welcome to the game of sticks!");
        determineInitialSticks();
        determineGameType();
    }

    private void determineGameType() {
        do {
            System.out.println("Options:");
            System.out.println(" Play against a friend (1)");
            System.out.println(" Play against the computer (2)");
            System.out.print("Which option do you take (1-2)? ");
            this.gameType = this.input.nextInt();
        } while (!(isIntInputInRange(this.gameType, 1, 2)));
    }
    private void determineInitialSticks() {
        do {
            System.out.print("How many sticks are there on the table initially (10-100)? ");
            this.totalSticks = this.input.nextInt();
        } while (!(isIntInputInRange(this.totalSticks, 10, 100)));
    }

    private boolean isIntInputInRange(int input, int min, int max) {
        if (input >= min && input <= max) {
            return true;
        } else {
            System.out.println(String.format("Please enter a number between %d and %d", min, max));
            return false;
        }
    }
}
