package strategypattern.simuduck.implementation;

import strategypattern.simuduck.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
