package workshop2.zerg;

import workshop2.GroundUnit;
import workshop2.Unit;

public class Drone extends GroundUnit {

    public Drone(){
        super("드론",40,5,0,2);
        Zerg.startRegeneration(this);
    }

    public Drone(String name, int maxHp, int damage, int armor, int groundSpeed) {
        super(name, maxHp, damage, armor, groundSpeed);
        Zerg.startRegeneration(this);
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    @Override
    public void specialAbility() {
        Zerg.startRegeneration(this);
    }

    @Override
    public void attack(Unit target) {
        super.attack(target);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (!isAlive()) {
            Zerg.stopRegeneration();  // 유닛이 죽으면 자동 회복 중지
        }
    }

    @Override
    public void heal(int amount) {
        super.heal(amount);
    }
}
