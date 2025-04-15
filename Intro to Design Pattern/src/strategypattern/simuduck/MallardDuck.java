package strategypattern.simuduck;

import strategypattern.simuduck.implementation.FlyWithWings;
import strategypattern.simuduck.implementation.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        System.out.println("MallardDuck Constructor called");
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
