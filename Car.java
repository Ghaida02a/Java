public class Car {
    boolean isEngineOn;
    int fuelLevel;
    boolean isDoorLocked;
    boolean isDoorClosed;

    // Main function
    public static void main(String[] args) {
        Car car = new Car();
        
        car.isEngineOn = false;
        car.isDoorClosed = true;
        car.isDoorLocked = false;
        car.fuelLevel = 30; // Initialize fuel level to 50%

        car.startOrStopEngine();
        car.lockingDoor();
        car.refuel(30); // Refuel the car by 30%
    }
    
    public void startOrStopEngine() {
        if (isEngineOn) {
            isEngineOn = false;
            System.out.println("The engine is now Off");
        } else {
            isEngineOn = true;
            System.out.println("The engine is now On");
        }
    }
        
    public void lockingDoor() {
        if (isDoorClosed) {
            if (!isDoorLocked) {
                isDoorLocked = true;
                System.out.println("The door is now locked");
            } else {
                System.out.println("The door is already locked");
            }
        } else {
            System.out.println("The door is open and cannot be locked");
        }
    }

    public void refuel(int fuelAmount) {
        if (fuelLevel < 100) {
            int newFuelLevel = fuelLevel + fuelAmount; // Calculate new fuel level
            if (newFuelLevel > 100) {
                newFuelLevel = 100;
            }
            else if (newFuelLevel != fuelLevel) {
                fuelLevel = newFuelLevel;
                System.out.println("The car has been refueled. Current fuel level: " + fuelLevel + "%");
            }
			else {
                System.out.println("The fuel tank is already full. Current fuel level: " + fuelLevel + "%");
            }
        }
		else {
            System.out.println("The fuel tank is already full. Current fuel level: " + fuelLevel + "%");
        }
    }
}
