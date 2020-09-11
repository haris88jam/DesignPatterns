
public class SuperDrone implements Drone {
	
	public void beep() {
		for (int i = 0; i<=10; i++) {
			System.out.print("Beep.\t");
		}
	}
	public void spin_rotors() {
		System.out.println("Rotors are spinning.");
	}
	
	public void take_off() {
		System.out.println("Drone is taking off.");
	}

}
