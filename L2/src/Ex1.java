public class Ex1 {
    public static int metoda1(String s1, String s2){
        int cnt = 0;
        int l1 = s1.length();
        int l2 = s2.length();
        if (l2 == 0 || l1 < l2) {
            return 0;
        }
        for (int i = 0; i <= l1 - l2; i++) {
            if (s1.substring(i, i + l2).equals(s2)) {
                cnt++;
            }
        }
        return cnt;
    }
    public static int metoda2(String s1, String s2) {
        int cnt = 0;
        int index = s1.indexOf(s2);
        while (index != -1) {
            cnt++;
            index = s1.indexOf(s2, index + s2.length());
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s1 = "sir1 si cu sir2 fac un sir3";
        String s2 = "si";
        System.out.println(metoda1(s1, s2));
        System.out.println(metoda2(s1, s2));
    }
}
