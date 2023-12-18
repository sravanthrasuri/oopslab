import tvremote.TVRemoteControl;
import tvremote.TVSystem;
public class MainTV {
    public static void main(String[] args) {
        TVRemoteControl remote = new TVSystem();
        remote.switchOn();
        remote.tuneToStarSports();
        remote.tuneToNGC();
        remote.tuneToDiscovery();
        remote.tuneToStarMovies();
        remote.switchOff();
    }
}