/* ===================== TRIANGLE ===================== */
class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean contains(Point p) {
        double A = area(a, b, c);
        double A1 = area(p, b, c);
        double A2 = area(a, p, c);
        double A3 = area(a, b, p);
        return Math.abs(A - (A1 + A2 + A3)) < 1e-9;
    }

    private double area(Point p1, Point p2, Point p3) {
        return Math.abs(
                (p1.distance(p2) + p2.distance(p3) + p3.distance(p1)) / 2
        );
    }
}
