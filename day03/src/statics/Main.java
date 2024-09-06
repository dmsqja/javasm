package statics;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("k1","red");
        System.out.println(car);
        Car car2 = new Car("k2","red");
        System.out.println(car2);
        Car car3 = new Car("k3","red");
        System.out.println(car3);

        System.out.println(Car.vendor);

        System.out.println(Math.PI);
        System.out.println(Math.max(10,3));
    }
}
