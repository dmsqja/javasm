package workshop2.zerg;

import workshop2.Tribe;
import workshop2.Unit;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Zerg extends Tribe {

    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public Zerg() {
        super("저그");
    }

    public static void startRegeneration(Unit unit) {
        scheduler.scheduleAtFixedRate(() -> {
            if (unit.getHp() < unit.getMaxHp() && unit.isAlive()) {
                unit.heal(1);
                System.out.println(unit.getName() + "이(가) 체력을 1 회복했습니다. 현재 체력: " + unit.getHp());
            }
        }, 0, 4, TimeUnit.SECONDS);  // 4초마다 회복
    }
    public static void stopRegeneration() {
        if (!scheduler.isShutdown()) {
            scheduler.shutdown();
            System.out.println("모든 저그 유닛의 자동 회복이 중지되었습니다.");
        }
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
                throw new IllegalArgumentException("알 수 없는 저그 유닛 타입: " + unitType);
        }

        // 유닛 생성 후 자동 회복 시작
        startRegeneration(unit);

        return unit;
    }

    @Override
    public List<String> getAvailableUnits() {
        return List.of("드론", "뮤탈리스크", "저글링","오버로드");
    }
}