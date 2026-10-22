import java.util.*;
import java.lang.*;
class Fractie {
    private int numarator, numitor;
    Fractie(int x1, int x2) {
        if(x2 == 0) {
            this.numitor = 1;
        }
        else {
            this.numitor = x2;
        }
        this.numarator = x1;
    }
    Fractie() {
        this(1, 1);
    }
    public static int cmmdc(int a, int b) {
        while(b != 0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static int cmmmc(int a, int b) {
        return (a*b)/cmmdc(a, b);
    }
    public Fractie suma(Fractie o) {
        int n = cmmmc(this.numitor, o.numitor);
        int inmultire1 = n / this.numitor, inmultire2 = n / o.numitor;
        this.numarator = this.numarator * inmultire1;
        o.numarator = o.numarator * inmultire2;
        this.numitor = n;
        o.numitor = n;
        int numaratorTemporar = this.numarator + o.numarator;
        int divizor = cmmdc(numaratorTemporar, n);
        numaratorTemporar = numaratorTemporar / divizor;
        n = n / divizor;
        return new Fractie(numaratorTemporar, n);
    }
    public String toString() {
        return new String(numarator + "impartit pe " + numitor);
    }
    public boolean equals(Object o) {
        if(!(o instanceof Fractie))
            return false;
        Fractie x = (Fractie) o;
        if(this.numitor == x.numitor && this.numarator == x.numarator) return true;
        return false;
    }
    public static void main(String[] args){
        Fractie f1 = new Fractie(2, 3);
        Fractie f2 = new Fractie(5, 4);
        Fractie f3 = f1.suma(f2);
        System.out.println(f3.toString());
        System.out.println(f1.equals(f2));
    }
}

public class Prob1 {
}
