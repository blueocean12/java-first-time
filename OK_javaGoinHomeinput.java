import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OK_javaGoinHomeinput {

	public static void main(String[] args) {
		//args : 매개변수 /parameter
		String id = args[0];
		String Bright = args[1];
		// 사용자가 사용하고자 하는 값 모두를변경할 수 있음
	
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
		
	DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
	moodLamp.setBright(Double.parseDouble(Bright));
	moodLamp.on();
	
	}

}
