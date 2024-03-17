package src;

public class Java2048 {
    public static void main(String[] args) {
        Game game = new Game();
        game.printArray();

        for (int x = 0; x < 7; x++) {
            game.addNewNumbers();
            game.printArray();
        }
    }
}
