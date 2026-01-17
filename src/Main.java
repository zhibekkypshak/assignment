import geometry.*;
import AITU.*;

public class Main {
    public static void main(String[] args) {


        Student s1 = new Student("Ali", "Khan");
        s1.addGrade(4.0);
        s1.addGrade(3.8);
        Student s2=new Student("Bek", "Aruzhan");
        s2.addGrade(3.7);
        s2.addGrade(3.4);
        s2.addGrade(3.6);

        Group g = new Group("MT-2523");
        g.addStudent(s1);
        g.addStudent(s2);

        System.out.println(g);
        g.printHallOfFame();
    }
}


