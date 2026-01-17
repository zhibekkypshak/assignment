package AITU;

public class Student {


    private int id;
    private String firstname;
    private String lastname;
    private double[] grades;
    private int gradeCount;


    private static int nextId = 250001;
    private static String domain = "astanait.edu.kz";


    public Student() {
        this("John", "Wick");
    }

    public Student(String firstname, String lastname) {
        this.id = nextId++;
        this.firstname = firstname;
        this.lastname = lastname;
        this.grades = new double[10];
        this.gradeCount = 0;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double[] getGrades() {
        return grades;
    }

    public int getGradeCount() {
        return gradeCount;
    }

    public static int getNextId() {
        return nextId;
    }

    public static String getDomain() {
        return domain;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
        this.gradeCount = grades.length;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public static void setDomain(String domain) {
        Student.domain = domain;
    }

    public void addGrade(double grade) {
        grades[gradeCount++] = grade;
    }

    public double getGpa() {
        double sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return gradeCount == 0 ? 0 : sum / gradeCount;
    }

    public boolean isHonors() {
        return getGpa() >= 3.5;
    }

    public String getEmail() {
        return id + "@" + domain;
    }


    @Override
    public String toString() {
        return id + " " + firstname + " " + lastname + " "
                + getEmail() + " " + getGpa();
    }
}



