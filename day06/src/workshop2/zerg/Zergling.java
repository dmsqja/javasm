package workshop2.zerg;

import workshop2.GroundUnit;
import workshop2.Unit;

public class Zergling extends GroundUnit {


    public Zergling(){
        super("저글링", 35, 5, 0, 3);
    }

    public Zergling(String name, int maxHp, int damage, int armor, int groundSpeed) {
        super(name, maxHp, damage, armor, groundSpeed);
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    @Override
    public void specialAbility() {

    }

    @Override
    public void attack(Unit target) {
        super.attack(target);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
    }

    @Override
    public void heal(int amount) {
        super.heal(amount);
    }
    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo;
    }
}
