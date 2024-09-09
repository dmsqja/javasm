package workshop2.zerg;

import workshop2.AirUnit;
import workshop2.GroundUnit;

public class Overload extends AirUnit {

    private GroundUnit transportedUnit;

    public Overload() {
        super("오버로드", 200, 0, 0, 2);
        transportedUnit = null; // 초기에는 아무 유닛도 탑승하지 않음
    }

    @Override
    public void specialAbility() {
        if (transportedUnit == null) {
            // 유닛이 탑승하지 않은 경우
            System.out.println("오버로드가 지상 유닛을 수송할 준비가 되었습니다.");
            // 예시: 실제 수송할 유닛을 받아서 처리하는 로직은 여기에 추가
        } else {
            // 이미 유닛이 탑승한 경우
            System.out.println("오버로드가 이미 지상 유닛을 수송하고 있습니다.");
        }
    }

    public void loadGroundUnit(GroundUnit unit) {
        if (transportedUnit == null) {
            transportedUnit = unit;
            System.out.println(unit.getName() + "이(가) 오버로드에 탑승하였습니다.");
        } else {
            System.out.println("오버로드에 이미 다른 유닛이 탑승해 있습니다. " + unit.getName() + "은(는) 탑승할 수 없습니다.");
        }
    }

    public void unloadGroundUnit() {
        if (transportedUnit != null) {
            System.out.println(transportedUnit.getName() + "이(가) 오버로드에서 하차하였습니다.");
            transportedUnit = null;
        } else {
            System.out.println("오버로드에 탑승한 유닛이 없습니다.");
        }
    }
}
