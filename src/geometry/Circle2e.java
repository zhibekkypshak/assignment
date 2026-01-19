package geometry;

public class Circle2e {
        private double x;
        private double y;
        private double radius;

        public Circle2e() {
            this(0, 0, 1);
        }

        public Circle2e(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public double getX() { return x; }
        public double getY() { return y; }
        public double getRadius() { return radius; }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        public boolean contains(double x, double y) {
            return Math.hypot(this.x - x, this.y - y) <= radius;
        }

        public boolean contains(Circle2e c) {
            double d = Math.hypot(x - c.x, y - c.y);
            return d + c.radius <= radius;
        }

        public boolean overlaps(Circle2e c) {
            double d = Math.hypot(x - c.x, y - c.y);
            return d < radius + c.radius;
        }
    }


