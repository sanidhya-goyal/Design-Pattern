package chapter_1_strategypattern.simuduck.implementation;

import chapter_1_strategypattern.simuduck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can’t fly");
    }
}
