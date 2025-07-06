public class Projector {
    boolean isPowerOn;
    boolean isBrightnessLevelHigh;
    boolean isOnFocus;
    
    public static void main(String[] args) {
        Projector projector = new Projector();
        
		projector.isPowerOn = true;
        projector.isBrightnessLevelHigh = true;
        projector.isOnFocus = true; 

        projector.powerOnOrOff();
        projector.checkBrightnessLevel();
        projector.adjustFocus();
    }
    
    public void powerOnOrOff() {
        if (isPowerOn) {
            System.out.println("Projector powered ON");
            isBrightnessLevelHigh = false;
            isOnFocus = false; 
        }
		else {
            System.out.println("Projector powered OFF");
        }
    }
    
    public void checkBrightnessLevel() {
        if (isPowerOn) {
			if (isBrightnessLevelHigh){
				String statusLevel = isBrightnessLevelHigh ? "High" : "Low";
				System.out.println("Brightness level: " + statusLevel);
			}
			else {
				String statusLevel = isBrightnessLevelHigh ? "High" : "Low";
				System.out.println("Brightness set to: " + statusLevel);
			}
		}
		else {
            System.out.println("Cannot check brightness because the projector is OFF");
        }
    }
    
    public void adjustFocus() {
        if (isPowerOn) {
            if (!isOnFocus){
				String focusStatus = isOnFocus ? "IN focus" : "OUT of focus";
				System.out.println("Projector is now " + focusStatus);
			}
        }
		else {
            System.out.println("Cannot adjust focus - projector is OFF");
        }
    }
}
