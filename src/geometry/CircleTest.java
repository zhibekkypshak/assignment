package geometry;

public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(3, 4, 5);

        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());

        System.out.println(c2.contains(3, 4));
        System.out.println(c2.contains(10, 10));

        Circle c3 = new Circle(4, 4, 1);
        System.out.println(c2.contains(c3));

        Circle c4 = new Circle(7, 4, 3);
        Circle c5 = new Circle(20, 20, 2);

        System.out.println(c2.overlaps(c4));
        System.out.println(c2.overlaps(c5));
    }
}


