package ducks;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehaviour = new FlyNoWay();
		//quackBehaviour = new Squeak();
		quackBehaviour = () -> System.out.println("Squeak");
	}

	public RubberDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
		this.flyBehaviour = flyBehaviour;
		this.quackBehaviour = quackBehaviour;
	}
	
	public void display() {
		System.out.println("I am a rubber duck.");
	}
}
