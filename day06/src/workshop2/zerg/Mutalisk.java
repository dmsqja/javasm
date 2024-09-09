package workshop2.zerg;

import workshop2.AirUnit;

public class Mutalisk extends AirUnit {

    private boolean acidsprayActive;
    private long lastAcidSprayTime;
    private static final long COOLDOWN_TIME = 5000; // 쿨다운 시간 (밀리초 단위, 예: 5000ms = 5초)

    public Mutalisk() {
        super("뮤탈리스크", 120, 9, 0, 4);
        acidsprayActive = false;
        lastAcidSprayTime = System.currentTimeMillis();
    }

    @Override
    public void specialAbility() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastAcidSprayTime >= COOLDOWN_TIME) {
            acidsprayActive = true;
            lastAcidSprayTime = currentTime; // 쿨다운 시작
            performAcidSpray(); // 산성 스프레이 발사 메서드
        } else {
            System.out.println("산성 스프레이를 사용할 수 없습니다. 쿨다운 중입니다.");
        }
    }

    private void performAcidSpray() {
        // 산성 스프레이를 발사하는 로직
        System.out.println("산성 스프레이!!");
        // 이곳에 산성 스프레이의 효과를 구현
    }
}
