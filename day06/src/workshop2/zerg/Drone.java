package workshop2.zerg;

import workshop2.GroundUnit;

public class Drone extends GroundUnit {

    public Drone(){
        super("드론",40,5,0,2);
    }

    @Override
    public void specialAbility() {
        System.out.println("드론이 변태하기 시작합니다.");
    }

    public void collectResources(int amount) {
        System.out.println("드론이 자원을 " + amount + "만큼 수집합니다.");
    }

}
