package strategypattern.designpuzzle_adventuregame.implementation;

import strategypattern.designpuzzle_adventuregame.behavior.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Cutting with a knife");
    }
}
