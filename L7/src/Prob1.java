import java.io.*;
import java.lang.*;
import java.util.*;

class WordProcessor {
    public TreeSet<String> printWords(String fileName) throws IOException {
        TreeSet<String> ascSet = new TreeSet<>();
        String delim = " \t\n\r,.:;!?\"'()[]{}-";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, delim);
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken().trim();
                    if (!token.isEmpty()) {
                        ascSet.add(token);
                    }
                }
            }
        }
        return ascSet;
    }
    public TreeSet<String> printWordsComparator(TreeSet<String> asc) {
        TreeSet<String> descSet = new TreeSet<>((s1, s2) -> s2.compareTo(s1));
        descSet.addAll(asc);
        return descSet;
    }
}

class Main{
    public static void main(String[] args){
        String filename = "C:\\Users\\0702y\\IdeaProjects\\OOP-Lab\\L7\\src\\test01.txt";
        WordProcessor processor = new WordProcessor();
        try{
            TreeSet<String> ascSet = processor.printWords(filename);
            for(String word : ascSet){
                System.out.println(word);
            }
            System.out.println("si acum descrescator");
            TreeSet<String> descSet = processor.printWordsComparator(ascSet);
            for(String word : descSet){
                System.out.println(word);
            }
        }
        catch (IOException e) {
            System.out.println("eroare" + e.getMessage());
        }
    }
}