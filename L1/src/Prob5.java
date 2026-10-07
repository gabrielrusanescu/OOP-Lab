public class Prob5 {
    public int powInt(int baza, int exp){
        if(exp == 0){
            return 1;
        }
        return baza * powInt(baza, exp - 1);
    }
    public static void main(String args[]){
        Prob5 obiect = new Prob5();
        int rez1 = obiect.powInt(2, 5);
        //System.out.println(rez1);
        //System.out.println(Math.pow(2, 5));
        int rez2 = (int)Math.pow(2, 5);
        if(rez1 == rez2){
            System.out.println("egale");
        }
        else{
            System.out.println("diferite");
        }
    }
}
