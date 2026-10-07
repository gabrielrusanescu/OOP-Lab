public class Prob6 {
    public boolean isPrime(int n){
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
    }
    public static void main(String args[]){
        Prob6 obiect = new Prob6();
        //boolean rez = obiect.isPrime(7);
        for(int i = 1; i <= 20; i++){
            boolean rez = obiect.isPrime(i);
            if(rez == true){
                System.out.println(i + " prim");
            }
            else{
                System.out.println(i + " nu e prim");
            }
        }
    }
}
