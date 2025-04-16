package chapter_1_strategypattern.simuduck;

import chapter_1_strategypattern.simuduck.implementation.FlyWithWings;
import chapter_1_strategypattern.simuduck.implementation.Quack;

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
