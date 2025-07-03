public class WashingMachine {
    boolean isWashingMachineOn;
    boolean isDoorOpen;
    int waterLevel;
    String washingMode;

    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        
        washingMachine.isWashingMachineOn = true;
        washingMachine.isDoorOpen = false;
        washingMachine.waterLevel = 0;
        washingMachine.washingMode = "light"; // Set to "light" or "heavy" or "quick wash"

        washingMachine.OnOrOff();
        washingMachine.OpenDoor();
        washingMachine.adjustWaterLevel(5);
        washingMachine.displayWashingMode();
    }

    public void OnOrOff() {
        if (isWashingMachineOn) {
            System.out.println("The Washing Machine is on");
        }
		else {
            System.out.println("The Washing Machine is off");
        }
    }

    public void OpenDoor() {
        if (isDoorOpen) {
            System.out.println("The door is open");
        }
		else {
            System.out.println("The door is closed");
        }
    }

    public void adjustWaterLevel(int newWaterLevel) {
        if (isWashingMachineOn) {
            if (!isDoorOpen) {
                if (newWaterLevel >= 0 && newWaterLevel <= 10) {
                    waterLevel = newWaterLevel;
                    System.out.println("Water level adjusted to: " + waterLevel);
                }
				else {
                    System.out.println("Invalid water level. Please set a level between 0 and 10.");
                }
            }
			else {
                System.out.println("Cannot adjust water level, the door is open.");
            }
        }
		else {
            System.out.println("Cannot adjust water level, the washing machine is off.");
        }
    }

    public void displayWashingMode() {
        if (isWashingMachineOn && isDoorOpen == false) {
            System.out.println("The washing machine is in " + washingMode + " mode");
        }
		else {
            System.out.println("Cannot select washing mode, because the washing machine is off.");
        }
    }
}
