import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OK_javaGoinHome {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
	
		//elevator call 
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		
		//security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		
		// light on
		Lighting floorLamp = new Lighting(id+ " / floorLamp");
		floorLamp.on();
		
		Lighting hallLamp = new Lighting(id + " / halllamp");
		hallLamp.on();
		
		//

	}

}
