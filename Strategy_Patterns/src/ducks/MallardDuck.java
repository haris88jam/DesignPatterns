package ducks;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	public void display() {
		System.out.println("I am a mallard duck.");
	}
}
