import java.lang.*;
import java.util.*;
public class Ex3 {
    public static int metoda1(Vector test, int x){
        int cnt = 0, i = 0;
        while(i < test.size()){
            if((int) test.elementAt(i) == x) {
                cnt++;
                test.removeElementAt(i);
            }
            else i++;
        }
        return cnt;
    }
    public static void main(String[] args){
        Vector test = new Vector(0);
        Random generator = new Random();
        for(int i = 0; i < 20; i++){
            test.add(generator.nextInt(10));
        }
        //System.out.println(test);
        int x = 7;
        System.out.println(metoda1(test, x));
        int size = test.size(), minim = 20, maxim = -1, minpoz = -1;
        float sum = 0;
        for(int i = 0; i < size; i++){
            if((int) test.elementAt(i) > maxim) maxim = (int) test.elementAt(i);
            if((int) test.elementAt(i) < minim){
                minim = (int) test.elementAt(i);
                minpoz = i;
            }
            sum += (int) test.elementAt(i);
        }
        sum = sum / size;
        System.out.println(minim + " " + minpoz + " " + maxim + " " + sum);
    }
}
