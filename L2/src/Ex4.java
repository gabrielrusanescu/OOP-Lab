import java.util.*;

public class Ex4 {
    public static void reuniune(Vector v1, Vector v2, Vector v3){
        for(int i = 0; i < v1.size(); i++) {
            int val = (int) v1.elementAt(i);
            if(!v3.contains(val)) v3.add(val);
        }
        for(int i = 0; i < v2.size(); i++) {
            int val = (int) v2.elementAt(i);
            if(!v3.contains(val)) v3.add(val);
        }
    }

    public static void intersectie(Vector v1, Vector v2, Vector v4){
        for(int i = 0; i < v1.size(); i++) {
            int val = (int) v1.elementAt(i);
            if(v2.contains(val) && !v4.contains(val)) {
                v4.add(val);
            }
        }
    }

    public static void diferenta(Vector v1, Vector v2, Vector v5){
        for(int i = 0; i < v1.size(); i++) {
            int val = (int) v1.elementAt(i);
            if(!v2.contains(val) && !v5.contains(val)) {
                v5.add(val);
            }
        }
    }

    public static void main(String[] args){
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        for(int i = 0; i < 10; i++){
            v1.add(i);
            v2.add(i + 5);
        }
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        Vector v3 = new Vector();
        reuniune(v1, v2, v3);
        System.out.println("Reuniune (v1 si v2): " + v3);

        Vector v4 = new Vector();
        intersectie(v1, v2, v4);
        System.out.println("Intersectie (v1 si v2): " + v4);

        Vector v5 = new Vector();
        diferenta(v1, v2, v5);
        System.out.println("Diferenta (v1 si v2, adica v1 - v2): " + v5);
    }
}