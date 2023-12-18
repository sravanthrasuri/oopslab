import java.util.Scanner;
import sounds.Podcast;

public class SoundPlayerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Podcast podcast = new Podcast();

        System.out.println("Choose a sound to play: ");
        System.out.println("1. Podcast");
        System.out.println("2. Dolby");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                podcast.playPodcast();
                break;
            case 2:
                podcast.playDolby();
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}

