package workshop2.zerg;

import workshop2.GroundUnit;

public class Zergling extends GroundUnit {

    private boolean bitingActive;
    private long lastBitingTime;
    private static final long COOLDOWN_TIME = 3000; // 쿨다운 시간 (밀리초 단위, 예: 3000ms = 3초)

    public Zergling() {
        super("저글링", 35, 5, 0, 3);
        bitingActive = false;
        lastBitingTime = System.currentTimeMillis();
    }

    @Override
    public void specialAbility() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastBitingTime >= COOLDOWN_TIME) {
            bitingActive = true;
            lastBitingTime = currentTime; // 쿨다운 시작
            performBiting(); // 물어뜯기 능력을 발동하는 메서드
        } else {
            System.out.println("물어뜯기를 사용할 수 없습니다. 쿨다운 중입니다.");
        }
    }

    private void performBiting() {
        // 물어뜯기 능력을 발동하는 로직
        System.out.println("물어뜯기!!");
        // 이곳에 물어뜯기의 효과를 구현
    }
}
