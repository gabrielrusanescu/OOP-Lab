import java.util.*;

public class Ex4 {
    public static void reuniune(Vector v1, Vector v2, Vector v3){
        while(v1.size() > 0 && v2.size() > 0){
            v3.add((int) v1.elementAt(0));
            v3.add((int) v2.elementAt(0));
            v1.removeElementAt(0);
            v2.removeElementAt(0);
        }
        while(v1.size() > 0){
            v3.add((int) v1.elementAt(0));
            v1.removeElementAt(0);
        }
        while(v2.size() > 0){
            v3.add((int) v2.elementAt(0));
            v2.removeElementAt(0);
        }
    }
    public static void intersectie(Vector v1, Vector v2, Vector v4){
        while(v1.size() > 0 && v2.size() > 0){
            if((int) v1.elementAt(0) == (int) v2.elementAt(0)) {
                v4.add((int) v1.elementAt(0));
            }
            v1.removeElementAt(0);
            v2.removeElementAt(0);
        }
    }
    public static void diferenta(Vector v1, Vector v2, Vector v5){
        while(v1.size() > 0 && v2.size() > 0){
            /*if((int) v1.elementAt(0) != (int) v2.elementAt(0)) {
                v5.add((int) v1.elementAt(0));
            }*/
            if(v2.contains((int)v1.elementAt(0))){ }
            else v5.add((int) v1.elementAt(0));
            v1.removeElementAt(0);
            v2.removeElementAt(0);
        }
    }
    public static void main(String[] args){
        Vector v1 = new Vector(0);
        Vector v2 = new Vector(0);
        Random generator = new Random();
        for(int i = 0; i < 10; i++){
            v1.add(i);
            v2.add(i);
            //v2.add((i * 2) + 11);
        }
        System.out.println(v1 + "\n" + v2);
        Vector v3 = new Vector(0);
        //reuniune(v1, v2, v3);
        System.out.println(v3);
        Vector v4 = new Vector(0);
        diferenta(v1, v2, v4);
        System.out.println(v4);
    }
}
