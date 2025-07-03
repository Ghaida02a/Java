public class Elevator {
    boolean isDoorOpen;
    boolean isUp;
    int currentFloor;

    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        
        elevator.currentFloor = 0; // Ground floor
        elevator.isDoorOpen = false;
        elevator.isUp = true;

        elevator.openingDoor();
		elevator.goingUpOrDown(3); // Check direction after moving
        elevator.stopElevator(3); // Move to 3rd floor
        
    }

    public void openingDoor() {
        if (isDoorOpen) {
            System.out.println("The elevator door is open");
        } else {
            System.out.println("The elevator door is closed");
        }
    }


    public void goingUpOrDown(int movingFloor) {
        if (isDoorOpen == false) {
            System.out.println("The elevator is going to floor " + movingFloor);
			if (movingFloor < 0) {
            System.out.println("Invalid floor.");
            return;
        }

        if (movingFloor > currentFloor) {
            isUp = true;
            System.out.println("Moving up to floor " + movingFloor);
        }
		else if (movingFloor < currentFloor) {
            isUp = false;
            System.out.println("Moving down to floor " + movingFloor);
        }
		else {
            System.out.println("The elevator is already on floor " + currentFloor);
            return;
        }
        }
		else {
            System.out.println("The elevator door is open, close it first.");
        }
    }

    public void stopElevator(int movingFloor) {
        if (isDoorOpen) {
            System.out.println("Can not move the elevator, the door is open.");
            return;
        }
        currentFloor = movingFloor;
        System.out.println("Elevator arrived at floor " + currentFloor);
    }
}
