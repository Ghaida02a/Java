public class Refrigerator {
    boolean isDoorOpen;
    boolean isInCoolMode;
    int temperature;
    boolean isLightOn;

    public Refrigerator() {
        this.isDoorOpen = false;
        this.isInCoolMode = true;
        this.temperature = 10;
        this.isLightOn = false;
    }

    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        
        refrigerator.isDoorOpen = true;
        
        refrigerator.openDoor();
        refrigerator.lightOn();
        refrigerator.displayTemperature();
        refrigerator.displayCoolingMode();
    }
    
    public void openDoor() {
        if (isDoorOpen) {
            System.out.println("The door is open");
        } else {
            System.out.println("The door is closed");
        }
    }
    
    public void lightOn() {
        if (isDoorOpen) {
            isLightOn = true;
            System.out.println("The light is on");
        } else {
            isLightOn = false;
            System.out.println("The light is off");
        }
    }

    public void displayTemperature() {
        System.out.println("Current temperature: " + temperature + "°C");
    }

    public void displayCoolingMode() {
        if (isInCoolMode) {
            System.out.println("Cooling mode: Active");
        } else {
            System.out.println("Cooling mode: Inactive");
        }
    }
}
