package workshop2.zerg;

import workshop2.AirUnit;
import workshop2.Unit;

public class Overload extends AirUnit {

    public Overload() {
        super("오버로드", 200,0,0,2);
        Zerg.startRegeneration(this);
    }

    public Overload(String name, int maxHp, int damage, int armor, int airSpeed) {
        super(name, maxHp, damage, armor, airSpeed);
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
    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo;
    }
}
