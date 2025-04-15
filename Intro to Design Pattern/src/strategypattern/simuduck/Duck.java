package strategypattern.simuduck;

import strategypattern.simuduck.behavior.FlyBehavior;
import strategypattern.simuduck.behavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        System.out.println("Perform Fly called");
        flyBehavior.fly();
    }

    public void performQuack() {
        System.out.println("Perform Quack called");
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    public void setFlyBehavior(FlyBehavior fb) {
        System.out.println("setFlyBehavior called");
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        System.out.println("setQuackBehavior called");
        quackBehavior = qb;
    }
}