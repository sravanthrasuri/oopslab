import TVRemote.TataSkyRemote;
import java.util.Scanner;

public class TVRemoteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TataSkyRemote remote = new TataSkyRemote();

        int choice;
        do {
            System.out.println("TV Remote Menu:");
            System.out.println("1. Switch On");
            System.out.println("2. Switch Off");
            System.out.println("3. Play STAR SPORTS CHANNEL");
            System.out.println("4. Play NGC CHANNEL");
            System.out.println("5. Play DISCOVERY CHANNEL");
            System.out.println("6. Play STARMOVIES CHANNEL");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    remote.switchOn();
                    break;
                case 2:
                    remote.switchOff();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    remote.playChannel(choice);
                    break;
                case 0:
                    System.out.println("Exiting TV Remote.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

