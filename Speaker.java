public class Speaker {
    boolean isSpeakerOn;
    int volumeLevel;
    int batteryLevel;
    boolean isConnected;

    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        speaker.isSpeakerOn = true;
        speaker.isConnected = true;
        speaker.volumeLevel = 100;
        
        speaker.checkSpeakerStatus();
        speaker.checkConnectionStatus();
        speaker.volumeLevelCheck(6);
    }

    public void checkSpeakerStatus() {
        if (isSpeakerOn) {
            System.out.println("The speaker is on");
        } else {
            System.out.println("The speaker is off");
        }
    }

    public void checkConnectionStatus() {
        if (isSpeakerOn) {
            if (isConnected) {
                System.out.println("The speaker is connected");
            } else {
                System.out.println("The speaker is disconnected");
            }
        } else {
            System.out.println("The speaker is off");
        }
    }

    public void volumeLevelCheck(int newVolumeLevel) {
        if (isSpeakerOn && isConnected) {
			if (volumeLevel >= 0 && volumeLevel <= 50){
				System.out.println("Volume level: " + volumeLevel);
				volumeLevel += newVolumeLevel;
				System.out.println("Volume level is increased to : " + volumeLevel);
			}
			else {
				System.out.println("Volume level: " + volumeLevel);
				volumeLevel -= newVolumeLevel;
				System.out.println("Volume level is increased to : " + volumeLevel);
			}
        }
		else {
            System.out.println("Cannot check volume, speaker is off");
        }
    }
}
