/* ===================== CIRCLE ===================== */
class Circle {
    private double x, y, r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public boolean contains(Circle c) {
        double d = Math.hypot(c.x - x, c.y - y);
        return d + c.r <= r;
    }
}
