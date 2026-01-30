package task1;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
        super("Black", false);
        this.width = 1;
        this.height = 1;

    }
    public Rectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;


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
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public String getType() {
        return "Rectangle";
    }
    @Override
    public String toString() {
        return "Rectangle[width=" + width +
                ", height=" + height +
                ", color=" + getColor() +
                ", filled=" + isFilled() +
                ", dateCreated=" + getDateCreated() + "]";

    }


}

