package task2;

public class Rectangle extends PlanarShape {

    private double width;
    private double height;

    public Rectangle() {
        super();
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(String color, boolean filled, double x, double y,
                     double width, double height) {
        super(color, filled, x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle[x=" + getX() +
                ", y=" + getY() +
                ", width=" + width +
                ", height=" + height +
                ", color=" + getColor() +
                ", filled=" + isFilled() + "]";
    }
}

