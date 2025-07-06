public class GarageDoor {
    boolean isGarageDoorOpen;
	boolean isDoorLock;

	public static void main(String[] args) {
        GarageDoor garageDoor = new GarageDoor();
		
		garageDoor.isGarageDoorOpen = false;
		garageDoor.isDoorLock = true;
		
        garageDoor.openOrCloseDoor();
        garageDoor.lockOrUnlockDoor();
    }
	

    public void openOrCloseDoor() {
        if (isGarageDoorOpen) {
            System.out.println("Garage Door is open.");
        }
		else {
			System.out.println("Garage Door is closed.");
		}
    }
	
	public void lockOrUnlockDoor(){
		if (!isGarageDoorOpen && isDoorLock){
			System.out.println("Garage Door is locked.");
		}
		else {
			System.out.println("Garage Door is open. Can not lock the door");
		}
	}
}