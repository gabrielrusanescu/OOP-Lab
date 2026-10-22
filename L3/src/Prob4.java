class Numar{
    int nr;
    Numar(int x){
        nr = x;
    }
    Numar(){
        this(0);
    }
    public int suma(int a){
        return nr + a;
    }
    public int suma(int a, int b){
        return nr + a + b;
    }
    public int suma(int a, int b, int c){
        return nr + a + b + c;
    }
    public int suma(int a, int b, int c, int d){
        return nr + a + b + c + d;
    }
    public static void main(String[] args){
        Numar z = new Numar(7);
        System.out.println(z.suma(4));
    }
}
public class Prob4 {
}
