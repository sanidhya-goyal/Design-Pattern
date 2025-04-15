package strategypattern.designpuzzle_adventuregame;

import strategypattern.designpuzzle_adventuregame.implementation.BowAndArrowBehavior;
import strategypattern.designpuzzle_adventuregame.implementation.SwordBehavior;
import strategypattern.simuduck.Duck;
import strategypattern.simuduck.MallardDuck;
import strategypattern.simuduck.ModelDuck;
import strategypattern.simuduck.implementation.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.setWeapon(new SwordBehavior());
        king.battle();

        System.out.println("--------------");
        Character knight = new Knight();
        knight.setWeapon(new BowAndArrowBehavior());
        knight.battle();
    }
}