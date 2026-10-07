public class Prob7 {
    /*public boolean isPrime(int n){
        if(n < 1){
            return false;
        }
        if(n == 1) return true;
        for(int d = 2; d * d <= n; d++){
            if(n%d == 0){
                return false;
            }
        }
        return true;
    }*/
    public void ipoteza(int x){
        Prob6 prim = new Prob6();
        int cnt = 0, p = 4;
        while(cnt < x){
            for(int a = 1; a <= p / 2; a++){
                int b = p - a;
                if(prim.isPrime(a) && prim.isPrime(b)){
                    System.out.println(p + " = " + a + "+" + b);
                }
            }
            p = p + 2;
            cnt++;
        }
    }
    public static void main(String args[]){
        Prob7 obiect = new Prob7();

        obiect.ipoteza(4);
    }
}
