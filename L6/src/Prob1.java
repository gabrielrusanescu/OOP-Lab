abstract class Shape{
    private String color;
    private boolean filled;
    Shape(){
        color = null;
        filled = false;
    }
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}

class Circle extends Shape{
    private double radius;
    Circle(){
        radius = 0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    public String toString(){
        return "" + radius;
    }
}
