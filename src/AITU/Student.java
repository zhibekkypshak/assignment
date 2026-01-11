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

        public Student(String fn, String ln) {
            this.id = nextId++;
            this.firstname = fn;
            this.lastname = ln;
            this.grades = new double[10];
        }

        public void addGrade(double g) {
            grades[gradeCount++] = g;
        }

        public double getGpa() {
            double sum = 0;
            for (int i = 0; i < gradeCount; i++)
                sum += grades[i];
            return gradeCount == 0 ? 0 : sum / gradeCount;
        }

        public boolean isHonors() {
            return getGpa() >= 3.5;
        }

        public String getEmail() {
            return id + "@" + domain;
        }

        public String toString() {
            return id + " " + firstname + " " + lastname + " " + getEmail() + " " + getGpa();
        }
    }


