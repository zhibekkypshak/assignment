import task1.Shape;
import task1.Circle;
import task1.Rectangle;

import java.util.Random;

public class testTask1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        Random random = new Random();
        for (int i = 0; i < shapes.length; i++) {
            int type = random.nextInt(3);
            if (type == 0) {
                shapes[i] = new Shape("Red", true);
            }
            else if (type == 1) {
                shapes[i] = new Circle("Blue", false, random.nextDouble() * 10);
            }
            else {
                shapes[i] = new Rectangle(
                        random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        "Green",
                        true
                );
            }

        }
        for (Shape s : shapes) {
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle area = " + c.getArea());
            }
            else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle perimeter = " + r.getPerimeter());
            }
            else {
                System.out.println("Shape color = " + s.getColor());
            }

        }
        }
    }
