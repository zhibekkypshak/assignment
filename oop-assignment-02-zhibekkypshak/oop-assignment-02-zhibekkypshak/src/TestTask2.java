import task2.PlanarShape;
import task2.Circle;
import task2.Rectangle;

import java.util.ArrayList;
import java.util.Random;

public class TestTask2 {

    public static void main(String[] args) {

        ArrayList<PlanarShape> shapes = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            if (rand.nextBoolean()) {
                double x = rand.nextDouble() * 10;
                double y = rand.nextDouble() * 10;
                double r = rand.nextDouble() * 5 + 1;
                shapes.add(new Circle("Blue", false, x, y, r));
            } else {
                double x = rand.nextDouble() * 10;
                double y = rand.nextDouble() * 10;
                double w = rand.nextDouble() * 5 + 1;
                double h = rand.nextDouble() * 5 + 1;
                shapes.add(new Rectangle("Red", true, x, y, w, h));
            }
        }

        PlanarShape maxShape = shapes.get(0);
        for (PlanarShape s : shapes) {
            if (s.getPerimeter() > maxShape.getPerimeter()) {
                maxShape = s;
            }
        }
        System.out.println("Max perimeter shape:");
        System.out.println(maxShape);

        PlanarShape minShape = shapes.get(0);
        for (PlanarShape s : shapes) {
            if (s.getPerimeter() < minShape.getPerimeter()) {
                minShape = s;
            }
        }
        System.out.println("\nMin perimeter shape:");
        System.out.println(minShape);

        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                double d1 = Math.sqrt(shapes.get(i).getX() * shapes.get(i).getX() +
                        shapes.get(i).getY() * shapes.get(i).getY());
                double d2 = Math.sqrt(shapes.get(j).getX() * shapes.get(j).getX() +
                        shapes.get(j).getY() * shapes.get(j).getY());
                if (d1 > d2) {
                    PlanarShape tmp = shapes.get(i);
                    shapes.set(i, shapes.get(j));
                    shapes.set(j, tmp);
                }
            }
        }

        System.out.println("\nShapes sorted by distance from (0,0):");
        for (PlanarShape s : shapes) {
            System.out.println(s);
        }
    }
}

