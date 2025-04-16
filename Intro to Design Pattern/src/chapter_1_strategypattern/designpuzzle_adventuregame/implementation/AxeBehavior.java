package chapter_1_strategypattern.designpuzzle_adventuregame.implementation;

import chapter_1_strategypattern.designpuzzle_adventuregame.behavior.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("chopping with an axe");
    }
}
