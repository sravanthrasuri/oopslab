package TVRemote;

public class TataSkyRemote implements Television {
    private boolean isOn;
    
    public TataSkyRemote() {
        this.isOn = false;
    }

    @Override
    public void switchOn() {
        isOn = true;
        System.out.println("Welcome to TATA SKY");
    }

    @Override
    public void switchOff() {
        isOn = false;
        System.out.println("TV is switched off.");
    }

    @Override
    public void playChannel(int channelNumber) {
        if (isOn) {
            switch (channelNumber) {
                case 1:
                    System.out.println("Playing STAR SPORTS CHANNEL");
                    break;
                case 2:
                    System.out.println("Playing NGC CHANNEL");
                    break;
                case 3:
                    System.out.println("Playing DISCOVERY CHANNEL");
                    break;
                case 4:
                    System.out.println("Playing STARMOVIES CHANNEL");
                    break;
                case 5:
                    System.out.println("Playing a custom channel");
                    break;
                default:
                    System.out.println("Invalid channel number");
            }
        } else {
            System.out.println("Please switch on the TV before selecting channels.");
        }
    }
}
