package AITU;

public class Group {
        private String title;
        private Student[] students;
        private int count;

        public Group(String title) {
            this.title = title;
            students = new Student[4];
        }

        public void addStudent(Student s) {
            if (count == students.length) {
                Student[] newArr = new Student[students.length * 2];
                System.arraycopy(students, 0, newArr, 0, students.length);
                students = newArr;
            }
            students[count++] = s;
        }

        public double getAverageGpa() {
            double sum = 0;
            for (int i = 0; i < count; i++)
                sum += students[i].getGpa();
            return count == 0 ? 0 : sum / count;
        }

        public void printHallOfFame() {
            for (int i = 0; i < count; i++)
                if (students[i].isHonors())
                    System.out.println(students[i]);
        }

        public String toString() {
            return title + " " + count + " " + getAverageGpa();
        }
    }


