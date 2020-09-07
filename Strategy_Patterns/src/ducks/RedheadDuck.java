package ducks;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		setFlyBehaviour(new FlyWithWings());
		setQuackBehaviour(new Squeak());
	}

	public void display() {
		System.out.println("I am a redhead duck.");
	}
}
