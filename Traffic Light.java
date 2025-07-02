public class TrafficLight(){
	int timer;
	String color;
	
	// Main function
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
		
		trafficLight.color = "Red";
		trafficLight.timer = 60;
		
		trafficLight.changingColor();
	}
	
	public void changingColor(){
		System.out.println("The current color is " + trafficLight);
		
		if (trafficLight.equals("Red")){
			trafficLight.color = "Yellow";
			trafficLight.timer = 60;
			System.out.println("The color is changing to " + trafficLight.color + "in" + trafficLight.timer "seconds");
		}
		else if (trafficLight.equals("Yellow")){
			trafficLight.color = "Green";
			trafficLight.timer = 15;
			System.out.println("The color is changing to " + trafficLight.color + "in" + trafficLight.timer "seconds");
		}
		else (trafficLight.equals("Green")){
			trafficLight.color = "Red";
			trafficLight.timer = 60;
			System.out.println("The color is changing to " + trafficLight.color + "in" + trafficLight.timer "seconds");
		}
	}





}
