public class Camera {
    boolean isPoweredOn;
    int zoomLevel; 
    boolean isInFocus;


    public static void main(String[] args) {
        Camera camera = new Camera();
		
		camera.isPoweredOn = true;
        camera.zoomLevel = 0;   // No zoom
        camera.isInFocus = true;
        
        camera.powerOnOff();         // Turn on the camera
        camera.zoomIn();             // Zoom in
        camera.takePhoto();          // Take a photo
        camera.recordVideo();        // Record a video
        camera.zoomOut();            // Zoom out
        camera.powerOnOff();         // Turn off the camera
    }


    public void powerOnOff() {
        if (isPoweredOn) {
            System.out.println("Camera is now ON.");
        } else {
            System.out.println("Camera is now OFF.");
        }
    }

    // Behavior: Zoom in
    public void zoomIn() {
        if (isPoweredOn) {
            if (zoomLevel < 10) {
                zoomLevel++;
                System.out.println("Zoomed in. Current zoom level: " + zoomLevel);
            }
            else {
                System.out.println("Maximum zoom level reached.");
            }
        }
        else {
            System.out.println("Cannot zoom in because camera is OFF.");
        }
    }

    public void zoomOut() {
        if (isPoweredOn) {
            if (zoomLevel > 0) {
                zoomLevel--;
                System.out.println("Zoomed out. Current zoom level: " + zoomLevel);
            }
            else {
                System.out.println("Minimum zoom level reached.");
            }
        }
        else {
            System.out.println("Cannot zoom out because camera is OFF.");
        }
        this.isPoweredOn = false;
    }

    public void takePhoto() {
        if (isPoweredOn) {
            System.out.println("Photo taken");
        }
        else {
            System.out.println("Cannot take photo because camera is OFF.");
        }
    }

    public void recordVideo() {
        if (isPoweredOn) {
            System.out.println("Recording video");
        }
        else {
            System.out.println("Cannot record video because camera is OFF.");
        }
    }
}
