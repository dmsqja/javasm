package oop2;

public class Main2 {
    public static void main(String[] args) {
        Car car = new Car("K1","red",60,10);
        System.out.println(car);
        Engine engine= new Engine(100,3000,"s1");
        car.setEngine(engine);
        System.out.println(car);
    }
}
