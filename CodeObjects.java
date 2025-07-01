public class CodeObjects {
    int ramUsage;
    boolean isPowerOn;
    boolean isConnectedToNetwork;
    String runningApplications;
	
	
    // Main method
    public static void main(String[] args) {
        CodeObjects computer = new CodeObjects();
        
        // Example usage
        computer.isPowerOn = true; // Simulate that the computer is powered on
        computer.shutDown(); // Call the shutDown method
        computer.connectToTheInternet(true); // Connect to the internet
        computer.executePrograms(true); // Execute a program
        computer.sleep(); // Put the computer to sleep
    }

    // Behavior: Shutdown
    public void shutDown() {
        if (isPowerOn) {
            isPowerOn = false;
            System.out.println("Computer is shutdown.");
        } else {
            System.out.println("Computer is OFF.");
        }
    }

    public void connectToTheInternet(boolean newIsConnected) {
        this.isConnectedToNetwork = newIsConnected;
        if (newIsConnected) {
            System.out.println("Connected to the internet.");
        } else {
            System.out.println("Disconnected from the internet.");
        }
    }

    public void executePrograms(boolean newExecute) {
        if (newExecute) {
            System.out.println("There is an executing program.");
        } else {
            System.out.println("There is no program executing.");
        }
    }

    public void sleep() {
        if (isPowerOn) {
            System.out.println("The computer is in sleep mode.");
        } else {
            System.out.println("The computer is not in sleep mode.");
        }
    }
}
