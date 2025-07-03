public class Fan {
    private boolean isOn;
    private int speed; // 0 (off), 1 (low), 2 (medium), 3 (high)


	public static void main(String[] args) {
        Fan fan = new Fan();
		
		
        fan.turnOn();
        fan.changeSpeed(2);
        fan.turnOff();
    }
	
    public Fan() {
        this.isOn = true;
        this.speed = 1;
    }

    public void turnOn() {
        if (isOn) {
            System.out.println("Fan is already running at speed " + speed);
            return;
        }
        isOn = true;
        speed = 1;
        System.out.println("Fan turned on (low speed)");
    }

    public void turnOff() {
        if (isOn = false ){
            System.out.println("Fan is already off");
            return;
        }
        isOn = false;
        speed = 0;
        System.out.println("Fan turned off");
    }

    public void changeSpeed(int newSpeed) {
        if (isOn = false) {
            System.out.println("Cannot change speed fan is off");
            return;
        }
        
        if (newSpeed < 0 || newSpeed > 3) {
            System.out.println("Invalid speed level. Please use: 1 (low), 2 (medium), 3 (high)");
            return;
        }
    }
}
