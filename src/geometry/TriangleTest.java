package geometry;

    public class TriangleTest {
        public static void main(String[] args) {
            Triangle t = new Triangle(
                    new Point(0, 0),
                    new Point(5, 0),
                    new Point(0, 5)
            );

            System.out.println(t.getArea());
            System.out.println(t.contains(new Point(1, 1)));

        }
    }


