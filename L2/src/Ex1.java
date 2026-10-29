import java.lang.*;
public class Ex1 {
    public static int metoda1(String s1, String s2){
        int s2size = s2.length(), cnt = 0;
        for(int i = 0; i < s2size - 2; i++){
            if(s1.equals(s2.substring(i, i+2))){
                cnt++;
            }
        }
        return cnt;
    }
    public static int metoda2(String s1, String s2){
        int primul = 0, cnt = 0;
        while(s2.indexOf(s1, primul) != -1){
            primul = s2.indexOf(s1, primul) + 1;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args){
        String s1 = "si";
        String s2 = "sir1 si cu sir2 fac un sir3";
        System.out.println(metoda2(s1, s2));
    }
}
