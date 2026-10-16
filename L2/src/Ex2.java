import java.lang.*;
import java.util.*;
public class Ex2 {
    public static int aparitii(String s1, String s2){
        String[] lista = s1.split(" ");
        int listasize = lista.length, cnt = 0;
        for(int i = 0; i < listasize; i++){
            if(s2.equals(lista[i])) cnt++;
        }
        return cnt;
    }
    public static int aparitii2(String s1, String s2){
        StringTokenizer despartit = new StringTokenizer(s1, ":,.-? \n");
        int cnt = 0;
        while(despartit.hasMoreTokens()){
            String s3 = despartit.nextToken();
            if(s2.equals(s3)) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args){
        String s1 = "sir1 si si si sir2 sunt 2 siruri";
        String s2 = "si";
        System.out.println(aparitii2(s1, s2));
    }
}
