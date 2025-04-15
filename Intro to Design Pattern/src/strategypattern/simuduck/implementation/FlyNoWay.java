package strategypattern.simuduck.implementation;

import strategypattern.simuduck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can’t fly");
    }
}
