/* ===================== GROUP ===================== */
class Group {
    private String name;
    private Student[] students = new Student[10];
    private int size = 0;

    public Group(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        students[size++] = s;
    }

    public void printHallOfFame() {
        System.out.println("Hall of Fame:");
        for (int i = 0; i < size; i++) {
            if (students[i].getGPA() >= 3.5) {
                System.out.println(students[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Group " + name + ", students=" + size;
    }
}
