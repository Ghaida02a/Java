public class SmartWatch {
    int batteryLevel; // Corrected spelling from 'battryLevel' to 'batteryLevel'
    boolean isPowerOn;
    boolean isReadNotifications;

    public static void main(String[] args) {
        SmartWatch smartwatch = new SmartWatch();
        
        smartwatch.isPowerOn = true;
		
        smartwatch.checkPowerStatus();
        smartwatch.readOrUnreadNotifications();
        smartwatch.chargingBattery(7);
    }

    public void checkPowerStatus() {
        if (isPowerOn) {
            System.out.println("Smart Watch is ON");
        } else {
            System.out.println("Smart Watch is OFF");
        }
    }
    
    public void readOrUnreadNotifications() {
        if (isPowerOn) {
            if (isReadNotifications) {
                System.out.println("Notifications have been read");
            } else {
                System.out.println("Notifications are unread");
            }
        } else {
            System.out.println("Smart Watch is OFF. Cannot check notifications.");
        }
    }
    
    public void chargingBattery(int chargeAmount) {
        if (isPowerOn) {
            if (batteryLevel < 100) { // if the battery is less that 100%
                batteryLevel += chargeAmount; // to increase battery level
                System.out.println("Smart Watch is charging. Current battery level: " + batteryLevel + "%");
            }
			else {
                System.out.println("Battery level is sufficient. Current battery level: " + batteryLevel + "%");
            }
        }
		else {
            System.out.println("Smart Watch is OFF. Please power it ON to charge.");
        }
    }
}
