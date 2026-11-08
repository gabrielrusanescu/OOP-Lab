import java.util.*;
import java.lang.*;

/**
 * Clasa folosita pentru testarea problemei 2
 * @author Nan Mihai
 */

class Graph extends MyList {
    private int n;
    private int[] vizitat;

    public Graph(int n){
        super();
        this.n = n;
        this.vizitat = new int[n + 1];
        for(int i = 0; i <= n; ++i){
            super.add(new MyList());
        }
    }

    public void add(int x, int y){
        MyList list = (MyList) get(x);
        if(list != null) list.add(y);
    }

    public void dfs(int start){
        vizitat = new int[n + 1];
        dfsrec(start);
        System.out.println();
    }

    private void dfsrec(int i) {
        MyList list = (MyList) get(i);
        System.out.print(i + " ");
        vizitat[i] = 1;
        if (list != null) {
            for (int j = 0; j < list.size(); j++) {
                int vecin = (Integer) list.get(j);
                if (vizitat[vecin] == 0) {
                    dfsrec(vecin);
                }
            }
        }
    }

    @Override
    public String toString(){
        String res = "";
        for(int i = 1; i <= n; ++i){
            res += i + ":" + get(i) + "\n";
        }
        return res;
    }
}

public class TestGraph {
    public static void main(String args[]) {
        Graph g = new Graph(8);
        g.add(1, 2);
        g.add(1, 5);
        g.add(1, 8);
        g.add(2, 3);
        g.add(5, 6);
        g.add(4, 2);
        g.add(6, 3);
        g.add(6, 7);
        g.add(6, 8);
        g.add(3, 4);
        System.out.println(g);
        g.dfs(1);
    }
}