public class CoffeeMachine {
    boolean isCoffeeMachineOn;
    int waterLevel;

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        
		coffeeMachine.isCoffeeMachineOn = true;
        coffeeMachine.waterLevel = 400;
		
        coffeeMachine.turnOnOrOff();
        coffeeMachine.checkWaterLevel();
    }

    public void turnOnOrOff() {
        if (isCoffeeMachineOn) {
            System.out.println("Coffee Machine is on");
        }
		else {
            System.out.println("Coffee Machine is off");
        }
    }

    public void checkWaterLevel() {
        if (isCoffeeMachineOn) {
            if (waterLevel > 150) {
                System.out.println("Water level is sufficient: " + waterLevel + " ml");
            }
			else if (waterLevel > 0) {
                System.out.println("Water level is low: " + waterLevel + " ml. \n refill it.");
            }
			else {
                System.out.println("Water level is empty. Please refill.");
            }
        }
		else {
            System.out.println("Can not check water level because Coffee Machine is off");
        }
    }
}
