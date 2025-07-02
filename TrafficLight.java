public class TrafficLight {
    int timer;
    String color;

    // Main function
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        
        trafficLight.color = "Red";
        trafficLight.timer = 60;
        
        trafficLight.changingColor();
    }
    
    public void changingColor() {
        System.out.println("The current color is " + this.color); // Print current color
        
        if (this.color.equals("Red")) {
            this.color = "Yellow"; // Change to Yellow
            this.timer = 60; // Set timer for Yellow
            System.out.println("Changing to Yellow in " + this.timer + " seconds");
        } 
        else if (this.color.equals("Yellow")) {
            this.color = "Green"; // Change to Green
            this.timer = 15; // Set timer for Green
            System.out.println("Changing to Green in " + this.timer + " seconds");
        } 
        else {
            this.color = "Red"; // Change to Red
            this.timer = 60; // Set timer for Red
            System.out.println("Changing to Red in " + this.timer + " seconds");
        }
    }
}
