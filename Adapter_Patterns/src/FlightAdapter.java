public class FlightAdapter implements ducks.FlyBehaviour {
	
	Drone drone ;
	
	public FlightAdapter(Drone drone) {
		this.drone = drone;
	}
	
	public void fly() {
		drone.take_off();
		drone.spin_rotors();
	}

}
