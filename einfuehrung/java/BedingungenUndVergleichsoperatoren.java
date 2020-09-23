import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BedingungenUndVergleichsoperatoren {

    public static void main(String[] args) throws IOException {
        String correctUsername = "Lilly";
        String correctPassword = "NapoMaria";
        boolean isLogginCorrect;
        String username = "";
        String password = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Username: ");
        username = br.readLine();
        System.out.print("Password: ");
        password = br.readLine();
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            isLogginCorrect = true;
            System.out.print("Loggin is correct.");
        } else {
            isLogginCorrect = false;
            System.out.print("Loggin is incorrect.");
        }
    }
}
