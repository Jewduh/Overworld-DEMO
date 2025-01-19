public class Main {
    public static void main(String[] args) {
        Act1 game1 = new Act1();
        try {
            game1.startGame();
        } catch (InterruptedException e) {
            System.exit(0);
        }
    }
}
