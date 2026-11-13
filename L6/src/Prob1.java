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
        super(); radius = 0;
    }
    Circle(double radius){
        super(); this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        super(color, filled); this.radius = radius;
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

class Rectangle extends Shape{
    private double width;
    private double length;
    Rectangle(){
        super();
        width = 0; length = 0;
    }
    Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
        super.setFilled(filled);
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(){
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*width+2*length;
    }
    public String toString(){
        return "" + width + " " + length;
    }
}

class Square extends Rectangle{
    private double side;
    Square(){
        super();
        side = 0;
    }
    Square(double side){
        super(side, side);
        this.side = side;
    }
    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double side){
        this.side = side;
    }
    public void setLength(double side){
        this.side = side;
    }
    public String toString(){
        return "" + side;
    }
}