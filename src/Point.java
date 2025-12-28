/* ===================== POINT ===================== */
class Point {
    private double x, y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return Math.hypot(x - p.x, y - p.y);
    }
}
