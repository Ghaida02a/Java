public class Clock {
    String currentTime;
    boolean isAlarmOn;
    boolean isSoundOn;
    
    
    public static void main(String[] args) {
        Clock clock = new Clock();
        
        clock.setTime("2:30");
        clock.setAlarm("2:30");
        clock.checkSound();
    }
    
    public void setTime(String currentTime) {
        System.out.println("Time now is " + currentTime);
    }
    
    public void setAlarm(String alarm) {
        if (isAlarmOn) {
            System.out.println("Set alarm to " + alarm);
            if (alarm.equals(currentTime)) {
                System.out.println("Is Alarming!!");
            }
        } else {
            System.out.println("Alarm is off. Cannot set alarm.");
        }
    }
    
    public void checkSound() {
        if (isAlarmOn) {
            if (isSoundOn) {
                System.out.println("The sound is on");
            } else {
                System.out.println("The sound is off");
            }
        } else {
            System.out.println("The alarm is off, cannot check sound");
        }
    }
}
