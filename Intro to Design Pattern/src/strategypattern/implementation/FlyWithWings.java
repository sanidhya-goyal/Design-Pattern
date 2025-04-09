package strategypattern.implementation;

import strategypattern.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I’m flying!!");
    }
}