package chapter_1_strategypattern.simuduck.implementation;

import chapter_1_strategypattern.simuduck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
