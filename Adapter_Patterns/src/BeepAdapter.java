
public class BeepAdapter implements ducks.QuackBehaviour {
	
	Drone drone;
	
	public BeepAdapter(Drone drone) {
		this.drone = drone; 
	}
	
	
	public void quack() {
		drone.beep();
	}

}
