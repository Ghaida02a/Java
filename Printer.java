public class Printer {
    boolean isPowerOn;
    boolean paperStatus; // true if there is paper
    boolean inkLevel; // true if ink is sufficient
    String connectStatus;

    // Main function
    public static void main(String[] args) {
        Printer printer = new Printer();
        
        printer.isPowerOn = true;
        // Initialize printer status
        printer.paperStatus = true;
        printer.inkLevel = true;
        printer.connectStatus = "Network";
        
        // Call all methods here
        printer.turnOnOff();
        printer.connectivity();
		printer.loadOrEjectPaper(true);
        printer.copyPageNumber(3); //select any number
    }

    // Behaviors
    public void turnOnOff() {
        if (isPowerOn) {
            System.out.println("Printer is On.");
        } else {
            System.out.println("Printer is OFF.");
        }
    }
    
    public void connectivity() {
        if (isPowerOn) {
            if (connectStatus.equals("Network")) {
                System.out.println("Printer is Connected to a Network.");
            } else if (connectStatus.equals("Computer")) {
                System.out.println("Printer is Connected to a Computer.");
            } else {
                System.out.println("Printer is not connected.");
            }
        } else {
            System.out.println("Printer is Disconnected");
        }
    }

	public void loadOrEjectPaper(boolean load) {
        if (load) {
            paperStatus = true; //paper available
            System.out.println("Paper loaded into the printer.");
        } else {
            paperStatus = false;
            System.out.println("Paper ejected from the printer.");
        }
    }

    public void copyPageNumber(int numberOfPages) {
        if (isPowerOn) {
            if (paperStatus && inkLevel) {
                System.out.println("Copying " + numberOfPages + " pages...");
                // Simulate the copying process
                for (int i = 1; i <= numberOfPages; i++) {
                }
                System.out.println("Finished copying all pages.");
            } else {
                if (!paperStatus) {
                    System.out.println("Cannot copy. No paper available on Printer.");
                }
                if (!inkLevel) {
                    System.out.println("Cannot copy. Insufficient ink on Printer.");
                }
            }
        } else {
            System.out.println("Cannot copy. Printer is OFF.");
        }
    }
}