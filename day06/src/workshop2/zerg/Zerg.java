package workshop2.zerg;

import workshop2.Tribe;
import workshop2.Unit;

import java.util.List;

public class Zerg extends Tribe {

    public Zerg() {
        super("저그");
    }

    @Override
    public Unit createUnit(String unitType) {
        Unit unit;
        switch (unitType.toLowerCase()) {
            case "드론":
                unit = new Drone();
                break;
            case "뮤탈리스크":
                unit = new Mutalisk();
                break;
            case "저글링":
                unit = new Zergling();
                break;
            case "오버로드":
                unit = new Overload();
                break;
            default:
                System.out.println("알 수 없는 저그 유닛 타입: " + unitType);
                throw new IllegalArgumentException("알 수 없는 저그 유닛 타입: " + unitType);
        }

        return unit;
    }

    @Override
    public List<String> getAvailableUnits() {
        return List.of("드론", "뮤탈리스크", "저글링","오버로드");
    }
}