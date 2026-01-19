package task2;

public class Circle extends PlanarShape {

    private double radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(String color, boolean filled, double x, double y, double radius) {
        super(color, filled, x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Circle[x=" + getX() +
                ", y=" + getY() +
                ", radius=" + radius +
                ", color=" + getColor() +
                ", filled=" + isFilled() + "]";
    }
}


