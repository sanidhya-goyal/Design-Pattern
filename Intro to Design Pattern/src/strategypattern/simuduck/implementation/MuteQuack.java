package strategypattern.simuduck.implementation;

import strategypattern.simuduck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
