package strategypattern.designpuzzle_adventuregame.implementation;

import strategypattern.designpuzzle_adventuregame.behavior.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Shooting an arrow with a bow");
    }
}
