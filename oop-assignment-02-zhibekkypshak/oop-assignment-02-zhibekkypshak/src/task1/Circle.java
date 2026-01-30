package task1;

public class Circle extends Shape{
    private double radius;
    public Circle(){
        super("Green", false);
        this.radius=1;
    }
    public  Circle(String color,boolean filled,double radius){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimetr(){
        return 2*Math.PI*radius;
    }
    @Override
    public String getType(){
        return "Circle";
    }
    @Override
    public String toString(){
        return "Circle[radius=" + radius +
                ", color=" + getColor() +
                ", filled=" + isFilled() +
                ", dateCreated=" + getDateCreated() +
                "]";



    }
}

