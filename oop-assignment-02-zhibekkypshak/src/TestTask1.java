import task1.Shape;
import task1.Circle;
import task1.Rectangle;

import java.util.Random;

public class TestTask1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Shape[] arr = new Shape[10];

        for (int i = 0; i < arr.length; i++) {
            int t = rand.nextInt(3);
            if (t == 0) {
                arr[i] = new Shape("Red", true);
            } else if (t == 1) {
                double r = rand.nextDouble() * 10;
                arr[i] = new Circle("Blue", false, r);
            } else {
                double w = rand.nextDouble() * 10;
                double h = rand.nextDouble() * 10;
                arr[i] = new Rectangle(w, h, "Green", true);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            Shape s = arr[i];
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle area: " + c.getArea());
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle perimeter: " + r.getPerimeter());
            } else {
                System.out.println("Shape color: " + s.getColor());
            }
        }
    }
}

