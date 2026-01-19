package geometry;

public class CircleeTest {
    public static void main(String[] args) {

        Circle2e c1 = new Circle2e();
        Circle2e c2 = new Circle2e(3, 4, 5);

        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());

        System.out.println(c2.contains(3, 4));
        System.out.println(c2.contains(10, 10));

        Circle2e c3 = new Circle2e(4, 4, 1);
        System.out.println(c2.contains(c3));

        Circle2e c4 = new Circle2e(7, 4, 3);
        Circle2e c5 = new Circle2e(20, 20, 2);

        System.out.println(c2.overlaps(c4));
        System.out.println(c2.overlaps(c5));
    }
}


