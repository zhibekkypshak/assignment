package task1;
import java.util.Date;

public class Shape {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public Shape(){
        this.color="Black";
        this.filled=false;
        this.dateCreated=new Date();
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
        this.dateCreated=new  Date();
    }
    public String getColor(){
        return color;
    }
    public void setColor(String Color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filledd){
        this.filled=filled;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public String getType(){
        return "Shape";
    }

    @Override
    public String toString(){
        return "Shape[color="+color+", filled="+ filled+ ", dateCreated="+ dateCreated+"]";
    }


}

