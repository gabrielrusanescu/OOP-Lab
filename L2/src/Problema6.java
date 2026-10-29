import java.util.Vector;

public class Problema6{
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add(3.14);
        v.add(5.5f);
        v.add("Salut");
        v.add('A');
        v.add(true);
        v.add(42);
        v.add("Java");
        v.add(2.71);

        Class<?>[] tipuri = {
                Integer.class,
                Double.class,
                Float.class,
                String.class,
                Character.class,
                Boolean.class
        };
        Vector<Integer> aparitii = new Vector<>();
        for(int i = 0; i < tipuri.length; i++) {
            aparitii.add(0);
        }
        for(int i = 0; i < v.size(); i++) {
            Object element = v.get(i);
            for (int j = 0; j < tipuri.length; j++) {
                if (element.getClass().equals(tipuri[j])) {
                    int cnt = aparitii.get(j);
                    aparitii.set(j, cnt + 1);
                    break;
                }
            }
        }

        System.out.println("Vectorul principal: " + v);
        System.out.println("\nRez cnt:");
        for(int i = 0; i < tipuri.length; i++) {
            System.out.println(tipuri[i] + " " + aparitii.get(i) + " aparitii");
        }
    }
}