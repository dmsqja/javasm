package inter;

public class Mobile {
    public static void main(String[] args) {
        Remote remote = new Air();
        remote.turnOff();
        remote.turnOn();

        Bluetooth bluetooth = new Tv();
        bluetooth.on();
        bluetooth.pairing();
    }
}