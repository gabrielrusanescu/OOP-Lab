import java.util.*;

public class Ex4 {
    static class test {
        int x;
        test() {
            this(1210);
        }
        test(int x) {
            this.x = x;
        }
        void cout() {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        test porc = new test();
        //porc.test();
        porc.cout();
    }
}
