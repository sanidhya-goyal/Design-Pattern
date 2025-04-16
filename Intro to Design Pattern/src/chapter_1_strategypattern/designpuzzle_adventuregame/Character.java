package chapter_1_strategypattern.designpuzzle_adventuregame;

import chapter_1_strategypattern.designpuzzle_adventuregame.behavior.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;
    public abstract void fight();

    public void battle() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
