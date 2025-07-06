public class Fan {
    boolean isFanOn;
    int speedLevel; // 0 (off), 1 (low), 2 (medium), 3 (high)


	public static void main(String[] args) {
        Fan fan = new Fan();
		
		fan.isFanOn = false;
		
        fan.turnOnOrOff(2);
        fan.changeSpeedLevel(2);
    }
	

    public void turnOnOrOff(int newSpeed) {
        if (isFanOn) {
            System.out.println("Fan is already on and running at speed " + newSpeed);
        }
		else {
			System.out.println("Fan is off");
		}
    }

    public void changeSpeedLevel(int newSpeed) {
        if (isFanOn = false) {
            System.out.println("Can not change speed fan is off");
        }
        
        if (newSpeed <= 0 || newSpeed > 3) {
            System.out.println("Invalid speed level. Please use: 1 (low), 2 (medium), 3 (high)");
        }
		else {
			System.out.println("change fan speed level to " + newSpeed);
		}
    }
}