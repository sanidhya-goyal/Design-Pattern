package strategypattern.simuduck.implementation;

import strategypattern.simuduck.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
