package ducks;

public class DecoyDuck extends Duck {
	
	public DecoyDuck(){
		setFlyBehaviour(new FlyNoWay());
		setQuackBehaviour(new MuteQuack());
	}
	
	public void display() {
		System.out.println("I am a duck Decoy");
	}

}
