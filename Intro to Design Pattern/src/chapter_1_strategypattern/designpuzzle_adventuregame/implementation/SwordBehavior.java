package chapter_1_strategypattern.designpuzzle_adventuregame.implementation;

import chapter_1_strategypattern.designpuzzle_adventuregame.behavior.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Swinging a sword");
    }
}
