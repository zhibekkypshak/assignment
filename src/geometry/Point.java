package geometry;

public class Point {
        private double x;
        private double y;

        public Point() {
            this(0, 0);
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }


        public double getY() {
            return y;
        }

        public double distance(Point p) {
            return Math.hypot(x - p.x, y - p.y);
        }

        public double distance(double x, double y) {
            return Math.hypot(this.x - x, this.y - y);
        }
    }


