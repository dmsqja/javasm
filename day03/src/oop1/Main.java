package oop1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.toString());
        //car.toString() 뒤에 toString()은 이미 호출되고 있으나 생략 되어 이미 포함 되있음
        car.go();
        car.brake();

        Car car2 = new Car(100,"My Car", "red");
        System.out.println(car2);
        car2.go();
        car2.brake();
    }
}
