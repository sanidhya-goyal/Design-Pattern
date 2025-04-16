package chapter_1_strategypattern.simuduck.implementation;

import chapter_1_strategypattern.simuduck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I’m flying!!");
    }
}