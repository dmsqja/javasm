package oop3;

import java.util.Random;

public class Engine{
    private int serial;
    private boolean engineOnOffStatus;

    Random random = new Random();

    public Engine(){
        this.serial = random.nextInt(10000)+1;
        this.engineOnOffStatus = false;
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
            System.out.println("엔진이 꺼졌습니다. ");
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "serial=" + serial +
                ", engineOnOffStatus=" + engineOnOffStatus +
                ", random=" + random +
                '}';
    }
}