package chapter_1_strategypattern.designpuzzle_adventuregame;

import chapter_1_strategypattern.designpuzzle_adventuregame.implementation.BowAndArrowBehavior;
import chapter_1_strategypattern.designpuzzle_adventuregame.implementation.SwordBehavior;

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