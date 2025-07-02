public class Door {
    boolean isDoorOpen;
    boolean isDoorLocked;
	

    // Main function
    public static void main(String[] args) {
        Door door = new Door();
		
		door.isDoorOpen = true;
		door.isDoorLocked = true;
		
		door.openingDoor();
		door.lockingDoor();
	}
	
	public void openingDoor(){
		if (isDoorOpen){
			System.out.println("The door is open");
		}
		else {
			System.out.println("The door is closed");
		}
	}
        
	public void lockingDoor(){
		if (isDoorOpen == false){
			System.out.println("The door is locked");
		}
		else {
			System.out.println("The door is unlocked");
		}
	}
}