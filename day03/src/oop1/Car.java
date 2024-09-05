package oop1;

public class Car {
    private int serial;
    private String name;
    private String color;

    public Car() {
        serial = 0;
    }

    public Car(String name, String color) {
        this();
        this.name = name;
        this.color = color;
    }

    public Car(int serial, String name, String color) {
        this.serial = serial;
        this.name = name;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerial() {
        return serial;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override   //어노테이션
    public String toString() {  //스트링화 하는거임
        return "Car{" +
                "serial=" + serial +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void go(){
        System.out.println(this.name);
        System.out.println("Car go");
    }
    public void brake(){
        System.out.println(this.name);
        System.out.println("Car brake");
    }
}
