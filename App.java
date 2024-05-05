import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Password length: ");
        int length = Integer.parseInt(scanner.nextLine());
        scanner.close();
        
        for (int i = 1; i <= length; i++) {
            int zakres = random.nextInt(3);
            if (zakres == 0) {
                System.out.print((char) ('a' + random.nextInt(26)));
            } else if (zakres == 1) {
                System.out.print((char) ('!' + random.nextInt(25)));
            } else {
                System.out.print((char) ('?' + random.nextInt(28)));
            }
        }
    }
}