/* ===================== STUDENT ===================== */
class Student {
    private String firstName, lastName;
    private double[] grades = new double[10];
    private int count = 0;

    public Student(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public void addGrade(double g) {
        grades[count++] = g;
    }

    public double getGPA() {
        double sum = 0;
        for (int i = 0; i < count; i++) sum += grades[i];
        return count == 0 ? 0 : sum / count;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " GPA=" + getGPA();
    }
}
