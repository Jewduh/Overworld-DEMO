import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Game {
    Player p = new Player();
    Random r = new Random();

    public void startGame() throws InterruptedException {
        // *** Pre Game Info *** //

        Scanner cont = new Scanner(System.in);
        p.have_fancy_coin = false;
        double coin_flip = (double) Math.random();
        String coin_value = "null";
        p.playerScore = 0;
        p.playerHighScore = 0;

        // ***** //
        boolean play = true;
        while (play) {
            System.out.println("Welcome to Flip A Coin!");
            try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
            System.out.println("The game is simple, press F to flip a coin!");
            try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
            System.out.println("If you win, you will get get money which has absoultely no purpose!");
            try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
            // *** //
            Scanner info = new Scanner(System.in);
            System.out.println("What is your name?");
            p.player_name = info.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Best of luck " + p.player_name);
            try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
            // *** //

            Scanner want = new Scanner(System.in);
            System.out.println("What side do you want?\nheads or tails?");
            String user_want = want.nextLine().toLowerCase();
            while (!user_want.equals("heads") && !user_want.equals("tails")) {
                System.out.println("Please pick either heads or tails!");
                user_want = want.nextLine().toLowerCase();
            }
            if (user_want.equals("heads")) {
                System.out.println("You have selected heads!");
                this.p.player_choice = "heads";
                try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
            } else if (user_want.equals("tails")) {
                System.out.println("You have selected tails!");
                this.p.player_choice = "tails";
                try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
            }

            Scanner flip = new Scanner(System.in);
            System.out.println("Press F to flip!");
            try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
            // *** //
            String user_flip = flip.nextLine().toLowerCase();
            while (!user_flip.equals("f")) {
                System.out.println("Please press F!");
                user_flip = flip.nextLine().toLowerCase();
            }
            if (user_flip.equals("f")) {
                if (coin_flip > 0.50) {
                    System.out.println("The coin landed on heads!");
                    try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
                    coin_value = "heads";
                } else if (coin_flip < 0.50) {
                    System.out.println("The coin landed on tails!");try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
                    coin_value = "tails";
                }
            }
            // This is the winning case
            if ((user_want.equals("heads") && (coin_value.equals("heads"))) || ((user_want.equals("tails") && (coin_value.equals("tails"))))) {
                System.out.println("Congratulations " + p.player_name + ". You Won!");

                this.p.playerScore += 1;
                this.p.playerHighScore += 1;
                System.out.println("Your player score is: " + p.playerScore);
                try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
                System.out.println("Your high score is: " + p.playerHighScore);
                try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
                System.out.println("Would you like to flip again? yes | no");
                //add flip again system
                Scanner flipAgain = new Scanner(System.in);
                String fAgain = flipAgain.nextLine().toLowerCase();

                while (!fAgain.equals("yes") && !fAgain.equals("no")) {
                    System.out.println("Please choose a valid option: yes | no");
                    fAgain = flipAgain.nextLine().toLowerCase();
                }
                if (fAgain.equals("no")) {
                    System.out.println("Thanks for playing");
                    System.exit(0);
                    play = false;
                } else {
                    System.out.println("Press F to flip");
                    user_flip = flip.nextLine().toLowerCase();
                }
            }
            // This is the losing case
            else {
                System.out.println("Sorry but you lost!");
                System.out.println("Would you like to play again?");
                Scanner endGame = new Scanner(System.in);
                String endChoice = endGame.nextLine().toLowerCase();

                while (!endChoice.equals("yes") && !endChoice.equals("no")) {
                    System.out.println("Please choose yes or no");
                    endChoice = endGame.nextLine().toLowerCase();
                }
                if (endChoice.equals("no")) {
                    System.exit(0);
                }
            }
        }
    }
}
