import java.util.Arrays;

public class Prob8 {

    public static void main(String args[]){
        int n = 12;
        int[] v = new int[n];
        for(int i = 0; i < v.length; i++){
            v[i] = (int)(Math.random() * 100);
            System.out.print(v[i] + " ");
        }
        java.util.Arrays.sort(v);
        System.out.print("\nAcum sortez\n");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        int elemmijloc = v[v.length / 2];
        System.out.print("\n" + Arrays.binarySearch(v, elemmijloc));
    }
}
