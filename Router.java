public class Router {
    boolean isRouterOn;
    boolean isRouterConnected;
    int countDevices;
    
    
    public static void main(String[] args) {
        Router router = new Router();
        
		router.isRouterOn = true;
        router.isRouterConnected = true;
        router.countDevices = 1;
		
        router.powerOnOrOff();
        router.connectRouter();
        router.countingDevices();
        router.addDevice();
    }
    
    public void powerOnOrOff() {
        if (isRouterOn) {
            System.out.println("Router is on");
        }
		else {
            System.out.println("Router is off");
        }
    }
    
    public void connectRouter() {
        if (isRouterOn) {
            System.out.println("Router is connected");
        }
		else {
            System.out.println("Router is off. Cannot connect.");
        }
    }
    
    public void countingDevices() {
        if (isRouterOn && isRouterConnected) {
            System.out.println("Number of connected devices: " + countDevices);
        }
		else {
            System.out.println("Router is off or disconnected.");
        }
    }
    
    public void addDevice() {
        if (isRouterOn && isRouterConnected) {
            countDevices++;
            System.out.println("Device added. Total devices: " + countDevices);
        }
		else {
            System.out.println("Router is off or disconnected. Cannot add device.");
        }
    }
}
