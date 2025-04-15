package strategypattern.simuduck.implementation;

import strategypattern.simuduck.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I’m flying with a rocket!");
    }
}
