public class Main {

    public static void main(String[] args) {

        // ===== Geometry demo =====
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        System.out.println("Distance: " + a.distance(b));

        Circle big = new Circle(0, 0, 5);
        Circle small = new Circle(1, 1, 1);
        System.out.println("Circle contains circle: " + big.contains(small));

        Triangle triangle = new Triangle(
                new Point(0, 0),
                new Point(5, 0),
                new Point(0, 5)
        );
        System.out.println("Triangle contains point (1,1): "
                + triangle.contains(new Point(1, 1)));

        Rectangle r1 = new Rectangle(0, 0, 4, 4);
        Rectangle r2 = new Rectangle(1, 1, 2, 2);
        System.out.println("Rectangle contains: " + r1.contains(r2));

        // ===== Student demo =====
        Student s1 = new Student("Ali", "Khan");
        Student s2 = new Student("Sara", "Lee");

        s1.addGrade(4.0);
        s1.addGrade(3.8);
        s2.addGrade(3.2);

        Group g = new Group("MT-2523");
        g.addStudent(s1);
        g.addStudent(s2);

        System.out.println(g);
        g.printHallOfFame();
    }
}

