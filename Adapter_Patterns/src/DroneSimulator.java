import ducks.FlyBehaviour;
import ducks.QuackBehaviour;
public class DroneSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drone drone = new SuperDrone();
		FlyBehaviour flightAdapter = new FlightAdapter(drone);
		FlyBehaviour flyDuck = flightAdapter;
		FlyDuck(flyDuck);
		
		QuackBehaviour beepAdapter = new BeepAdapter(drone);
		QuackBehaviour speakDuck = beepAdapter;
		SpeakDuck(speakDuck);
		 
		

	}
	static void FlyDuck(FlyBehaviour flyDuck) {
		flyDuck.fly();		
	}
	
	static void SpeakDuck(QuackBehaviour speakDuck) {
		speakDuck.quack();
		
	}
}
