package main;

import ducks.Duck;
import ducks.DecoyDuck;
import ducks.FlyBehaviour;
import ducks.FlyRocketPowered;
import ducks.FlyWithWings;
import ducks.MallardDuck;
import ducks.QuackBehaviour;
import ducks.RubberDuck;
import ducks.ModelDuck; 

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MallardDuck mallard = new MallardDuck();
//		FlyBehaviour cantFly = () -> System.out.println("I can't'fly!");
		FlyBehaviour cantFly = new FlyWithWings();
		QuackBehaviour squeak = () -> System.out.println("Squeak,Squeak");
		RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
		DecoyDuck decoy = new DecoyDuck();
		
		Duck model = new ModelDuck();
		
		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
		
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
		rubberDuckie.performFly();
	
	}

}
