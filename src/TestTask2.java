import task2.PlanarShape;
import task2.Circle;
import task2.Rectangle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Random;

public class TestTask2 {

    public static void main(String[] args) {

        ArrayList<PlanarShape> shapes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            if (random.nextBoolean()) {
                shapes.add(new Circle(
                        "Blue",
                        false,
                        random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        random.nextDouble() * 5 + 1
                ));
            } else {
                shapes.add(new Rectangle(
                        "Red",
                        true,
                        random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        random.nextDouble() * 5 + 1,
                        random.nextDouble() * 5 + 1
                ));
            }
        }

        Comparator<PlanarShape> maxPerimeterComparator =
                (a, b) -> Double.compare(b.getPerimeter(), a.getPerimeter());

        PlanarShape maxPerimeter =
                Collections.max(shapes, maxPerimeterComparator);

        System.out.println("Max perimeter shape:");
        System.out.println(maxPerimeter);

        Comparator<PlanarShape> minPerimeterComparator =
                (a, b) -> Double.compare(a.getPerimeter(), b.getPerimeter());

        PlanarShape minPerimeter =
                Collections.min(shapes, minPerimeterComparator);

        System.out.println("\nMin perimeter shape:");
        System.out.println(minPerimeter);

        Comparator<PlanarShape> distanceComparator =
                (a, b) -> {
                    double da = Math.sqrt(a.getX() * a.getX() + a.getY() * a.getY());
                    double db = Math.sqrt(b.getX() * b.getX() + b.getY() * b.getY());
                    return Double.compare(da, db);
                };

        Collections.sort(shapes, distanceComparator);

        System.out.println("\nShapes sorted by distance from (0,0):");
        for (PlanarShape s : shapes) {
            System.out.println(s);
        }
    }
}

