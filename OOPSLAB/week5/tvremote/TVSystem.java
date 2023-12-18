package tvremote;
public class TVSystem implements TVRemoteControl{
    private boolean isOn;
    private String currentChannel;

    public TVSystem(){
        this.isOn=false;
        this.currentChannel="None";
    }
    public void switchOn(){
        isOn=true;
        System.out.println("TV is switched On");
    }
    public void switchOff() {
        isOn = false;
        System.out.println("TV switched off. Goodbye!");
    }
    public void tuneToStarSports() {
        if (isOn) {
            currentChannel = "Star Sports Channel";
            System.out.println("Tuned to " + currentChannel);
        } else {
            System.out.println("Please switch on the TV first.");
        }
    }
    public void tuneToNGC() {
        if (isOn) {
            currentChannel = "NGC Channel";
            System.out.println("Tuned to " + currentChannel);
        } else {
            System.out.println("Please switch on the TV first.");
        }
    }
    public void tuneToDiscovery() {
        if (isOn) {
            currentChannel = "Discovery Channel";
            System.out.println("Tuned to " + currentChannel);
        } else {
            System.out.println("Please switch on the TV first.");
        }
    }
    public void tuneToStarMovies() {
        if (isOn) {
            currentChannel = "Star Movies Channel";
            System.out.println("Tuned to " + currentChannel);
        } else {
            System.out.println("Please switch on the TV first.");
        }
    }
}