class Punct{
    private int x, y;
    Punct(int a, int b){
        x = a;
        y = b;
    }
    Punct(){
        this(0, 0);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public String toString(){
        return new String("(" + x + ", " + y + ")");
    }
    public double distance(int a, int b){
        if(b > a) return b-a;
        return a-b;
    }
    public double distance(Punct p1){
        return Math.sqrt((this.x - p1.x)*(this.x-p1.x) + (this.y - p1.y)*(this.y-p1.y));
    }
}
class Test{
    public static void main(String[] args){
        Punct primul = new Punct(1, 2);
        System.out.println(primul.distance(new Punct(-1, 3)));
    }
}
public class Prob5 {
}
