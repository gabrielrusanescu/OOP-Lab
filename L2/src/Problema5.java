public class Problema5 {

    public static String cenzurare(String text, String[] cuvinte){
        int cuvinteSize = cuvinte.length, ok = 1;
        for(int i = 0; i < cuvinteSize; i++){
            int curentSize = cuvinte[i].length();
            if(text.contains(cuvinte[i])){
                ok = 0;
                String cenzurat;
                if (curentSize <= 2) {
                    cenzurat = "*".repeat(curentSize);
                } else {
                    cenzurat = cuvinte[i].charAt(0) + "*".repeat(curentSize - 2) + cuvinte[i].charAt(curentSize - 1);
                }
                text = text.replace(cuvinte[i], cenzurat);
            }
        }

        if(ok == 0){
            System.out.println("Text suspect");
        } else {
            System.out.println("Nimic suspect");
        }
        return text;
    }

    public static void main(String[] args){
        String text = "Un agresiv avea o sabie si un alt agresiv";
        String cuvinte[] = new String[2];
        cuvinte[0] = "agresiv";
        cuvinte[1] = "sabie";
        String rezultat = cenzurare(text, cuvinte);
        System.out.println(rezultat);
    }
}