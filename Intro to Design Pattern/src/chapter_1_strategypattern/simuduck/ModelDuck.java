package chapter_1_strategypattern.simuduck;

import chapter_1_strategypattern.simuduck.implementation.FlyNoWay;
import chapter_1_strategypattern.simuduck.implementation.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I’m a Model duck");
    }
}
