package inherit2;

import java.awt.*;

// 그림판
public class Main {
    public static void main(String[] args) {
        Shape shapes [] = new Shape[3];
        shapes[0] = new Circle(10,10,54);
        shapes[1] = new Rectangle(20,20,100,200);
        shapes[2] = new Triangle(30,30,300,400);

        for(Shape s : shapes) {
            System.out.println(s);
            System.out.println(s.getArea());
            System.out.println(s.getCircum());
            System.out.println("------------------------------------------------");
        }







        //Shape shape = new Shape();
    }
}
