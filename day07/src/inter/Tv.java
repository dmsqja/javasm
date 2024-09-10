package inter;

public class Tv implements Remote, Bluetooth{

    @Override
    public void turnOn() {
        System.out.println("Tv is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is turned off");
    }

    @Override
    public void pairing() {
        System.out.println("Tv is pairing");
    }
}