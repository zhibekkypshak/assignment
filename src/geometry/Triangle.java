package geometry;

public class Triangle {
        private Point p1;
        private Point p2;
        private Point p3;

        public Triangle() {
            this(
                    new Point(0, 0),
                    new Point(1, 1),
                    new Point(2, 5)
            );
        }

        public Triangle(Point p1, Point p2, Point p3) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }

        public double getArea() {
            return Math.abs(
                    (p1.getX()*(p2.getY()-p3.getY()) +
                            p2.getX()*(p3.getY()-p1.getY()) +
                            p3.getX()*(p1.getY()-p2.getY())) / 2
            );
        }

        public double getPerimeter() {
            return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
        }

        public boolean contains(Point p) {
            double area = getArea();
            Triangle t1 = new Triangle(p, p2, p3);
            Triangle t2 = new Triangle(p1, p, p3);
            Triangle t3 = new Triangle(p1, p2, p);

            return Math.abs(area - (t1.getArea() + t2.getArea() + t3.getArea())) < 0.0001;
        }


        public boolean contains(Triangle t) {
        return this.contains(t.p1)
                && this.contains(t.p2)
                && this.contains(t.p3);
    }

}


