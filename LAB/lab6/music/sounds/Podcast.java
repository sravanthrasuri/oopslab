package sounds;

public class Podcast implements Dolby {
    public void playPodcast() {
        System.out.println("Playing podcast sound");
    }

    @Override
    public void playDolby() {
        System.out.println("Playing Dolby sound");
    }
}
