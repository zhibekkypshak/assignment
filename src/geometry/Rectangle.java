package geometry;

public class Rectangle {
        private double x, y;
        private double width, height;

        public Rectangle() {
            this(0, 0, 1, 1);
        }

        public Rectangle(double x, double y, double w, double h) {
            this.x = x;
            this.y = y;
            this.width = w;
            this.height = h;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }

        public boolean contains(double px, double py) {
            return Math.abs(px - x) <= width / 2 &&
                    Math.abs(py - y) <= height / 2;
        }
    }


