public class Television {
    int volumeLevel;
    boolean isPowerOn;
    int currentChannel; 
	
    // Main method
    public static void main(String[] args) {
        Television myTV = new Television();
        
        myTV.turnOn();
        myTV.adjustVolume(50); // 50 is my selected
        myTV.switchChannel(3); // 3 is my selected
        myTV.play();
        myTV.pause();
        myTV.turnOff();
    }

    // Behaviors 
    public void turnOn() {
        isPowerOn = true; // Set power on
        System.out.println("TV is turn on.");
    }
	
    public void adjustVolume(int volume) {
        if (volume < 0) {
            volumeLevel = 0; // Minimum volume
            System.out.println("Volume is set to minimum (0).");
        } else if (volume > 100) {
            volumeLevel = 100; // Maximum volume
            System.out.println("Volume is set to maximum (100).");
        } else {
            volumeLevel = volume; // Set to the specified volume
            System.out.println("Volume set to " + volumeLevel);
        }
    }
	
    public void switchChannel(int channel) {
        currentChannel = channel;
        System.out.println("Switched to channel " + currentChannel);
    }
	
    public void play() {
        if (isPowerOn) {
            System.out.println("Playing current channel (" + currentChannel + ")");
        }
		else {
            System.out.println("Cannot play TV because the power is off");
        }
    }
	
    public void pause() {
        if (isPowerOn) {
            System.out.println("TV paused on channel " + currentChannel);
        } else {
            System.out.println("Cannot pause TV is off");
        }
    }
	
    public void turnOff() {
        if (isPowerOn) {
            isPowerOn = false; // Set power (off)
            System.out.println("TV turned off");
        } else {
            System.out.println("TV is already off");
        }
    }
}
