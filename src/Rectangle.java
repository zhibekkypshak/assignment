/* ===================== RECTANGLE ===================== */
class Rectangle {
    private double x, y, w, h;

    public Rectangle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public boolean contains(Rectangle r) {
        return r.x >= x &&
                r.y >= y &&
                r.x + r.w <= x + w &&
                r.y + r.h <= y + h;
    }
}
