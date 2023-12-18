import sounds.playDolby;
import sounds.Podcast;
import java.util.*;
public class MainSound{
    public static void main(String args[]){
        Podcast podcast=new Podcast();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sound to play:");
        int a=sc.nextInt();
        switch(a){
            case 1:
            System.out.println();
            if(podcast instanceof playDolby){
                playDolby dolby=(playDolby) podcast;
                dolby.playDolby();
            }
            else{
                System.out.println("Invalid choice of dolby");
            }
            break;
            case 2:
            System.out.println();
            podcast.playPodcast();
            break;
            default:
            System.out.println("Invalid Choice");
        }
    }
}