package strategypattern.simuduck.implementation;

import strategypattern.simuduck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I’m flying!!");
    }
}