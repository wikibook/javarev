import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoInHome {
    public static void main(String[] args) {
        String id = "JAVA APT 507";
        
        // Elevator call
        // org.opentutorials.iot.Elevator myElevator = new org.opentutorials.iot.Elevator("JAVA APT 507");
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);
        
        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();
        
        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id + " / floorLamp");
        floorLamp.on();

    }
}



