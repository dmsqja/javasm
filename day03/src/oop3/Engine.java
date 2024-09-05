package oop3;

import java.util.Random;

public class Engine{
    private int serial;
    private int gear;
    private boolean engineOnOffStatus;

    Random random = new Random();

    public Engine(){
        this.serial = random.nextInt(10000)+1;
        this.engineOnOffStatus = false;
        this.gear = 0;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if(!engineOnOffStatus){
            System.out.println("엔진이 꺼져있습니다. 기어를 변경할 수 없습니다.");
            return;
        }
        if(gear < 0 || gear > 6) {
            System.out.println("잘못된 기어입니다. 0과 6 사이의 기어를 선택하세요.");
        }else{
            this.gear = gear;
            System.out.println("기어가 " + gear + "(으)로 변경되었습니다.");
        }
    }

    public boolean isEngineOnOffStatus() {
        return engineOnOffStatus;
    }

    public void setEngineOnOffStatus(boolean engineOnOffStatus) {
        if (this.engineOnOffStatus == engineOnOffStatus){
            System.out.println(engineOnOffStatus ? "엔진이 이미 켜져 있습니다." : "엔진이 이미 꺼져 있습니다.");
            return;
        }
        if(engineOnOffStatus) {
            System.out.println("엔진이 켜졌습니다.");
        }else{
            this.gear = 0;
            System.out.println("엔진이 꺼졌습니다. ::기어 중립::");
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineOnOffStatus=" + engineOnOffStatus +
                ", gear=" + gear +
                ", serial=" + serial +
                '}';
    }
}