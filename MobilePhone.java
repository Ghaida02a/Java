public class MobilePhone {
    boolean isPowerOn;
    int batteryLevel;
    String ringerMode;
    String screenStatus;

	//main function
    public static void main(String[] args) {
        MobilePhone mobile = new MobilePhone();
        
        // Call all methods here
        mobile.powerOn();
        mobile.restartMobile();
        mobile.chargeBattery(2);
        mobile.isExecuteApp("Instagram"); // example app to execute
    }

    public void powerOn() {
        isPowerOn = true; // Set power on
        System.out.println("Mobile Phone is ON.");
    }

    public void restartMobile() {
        if (isPowerOn) {
            System.out.println("Mobile Phone is restarted.");
        } else {
            System.out.println("Mobile Phone is OFF. Please power it on first.");
        }
    }

    public void chargeBattery(int chargeAmount) {
        if (isPowerOn) {
            if (batteryLevel < 10) {
                batteryLevel += chargeAmount; // Increase battery level
                System.out.println("Mobile Phone is charging. Current battery level: " + batteryLevel + "%");
            } else {
                System.out.println("Battery level is sufficient. Current battery level: " + batteryLevel + "%");
            }
        }
		else {
            System.out.println("Mobile Phone is OFF. Please charge it .");
        }
    }

    public void isExecuteApp(String appName) {
        if (isPowerOn) {
            System.out.println("Executing " + appName + " application.");
        } else {
            System.out.println("Cannot execute application because the Mobile Phone is OFF.");
        }
    }
}
