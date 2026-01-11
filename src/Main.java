import geometry.*;
import AITU.*;

public class Main {
    public static void main(String[] args) {

        // geometry
        Point p = new Point(3, 4);
        Circle c = new Circle(0, 0, 5);
        System.out.println(p.distance(0, 0));
        System.out.println(c.getArea());

        // students
        Student s1 = new Student("Ali", "Khan");
        s1.addGrade(4.0);
        s1.addGrade(3.8);

        Group g = new Group("MT-2523");
        g.addStudent(s1);

        System.out.println(g);
        g.printHallOfFame();
    }
}


