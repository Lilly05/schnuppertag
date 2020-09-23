
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean spielen = true;

        while (spielen) {
            int randomNumber = (int) (Math.random() * 100);
            int round = 9;
            System.out.println("Willkommen zu NumberGuess");
            for (int i = 1; i <= round; i++) {
                System.out.print("Gib eine Zahl ein (1 bis 100): ");
                int guess = sc.nextInt();

                if (randomNumber == guess) {
                    System.out.println("Gewonnen!");
                    System.out.println("Du hast die Zahl erraten!");
                    break;
                } else if (randomNumber > guess) {
                    System.out.println("Die gesuchte Zahl ist grösser");
                } else {
                    System.out.println("Die gesuchte Zahl ist kleiner");
                }
                if (i == round) {
                    System.out.println("Verloren!");
                    System.out.println("Du hast deine Versuche aufgebraucht");
                    System.out.println("Die gesuchte Zahl ist " + randomNumber);
                    break;
                }
                if (i % 3 == 0) {
                    System.out.println("Übrige Versuche: " + (round - i));
                }
            }
            System.out.println("Willst du noch eine Runde spielen (j/n)?");
            if (br.readLine().toLowerCase().equals("n")) {
                spielen = false;
            }
        }

    }
}