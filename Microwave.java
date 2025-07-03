public class Microwave{
	boolean isPowerOn;
	boolean isDoorOpen;
	boolean isLightOn;
	int timer;
	
	public static void main(String[] args) {
        Microwave microwave = new Microwave();
		
		
		microwave.powerOnOrOff();
		microwave.OpenDoor();
		microwave.openOrCloseLight();
		microwave.setTimer(10);
	}
	
	
	public void powerOnOrOff() {
        if (isPowerOn == false) {
            System.out.println("The Microwave is on");
        }
		else {
            System.out.println("The Microwave is off");
        }
    }

    public void OpenDoor() {
        if (isPowerOn){
			if (isDoorOpen) {
            System.out.println("The microwave'door is open");
			}
		}
		else {
            System.out.println("The Microwave'door is closed");
        }
    }
	
	public void openOrCloseLight(){
		if (isPowerOn == false && isDoorOpen == false){
			if (isLightOn){
				System.out.println("The Microwave' light is on");
			}
			else {
				System.out.println("The Microwave' light is off");
			}
		}
		else {
			System.out.println("The Microwave is powered off");
		}
	}
	
	public void setTimer(int seconds) {
        if (seconds > 0) {
            timer = seconds;
            System.out.println("Timer is set for " + timer + " seconds");
        }
		else {
            System.out.println("Please set a valid timer greater than 0 seconds");
        }
    }
}