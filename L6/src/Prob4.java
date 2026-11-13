import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;

class Filtru implements FileFilter {
    private Vector<String> extensii = new Vector<String>();
    private Vector<String> cuvinte = new Vector<String>();

    Filtru(String fisExtensii, String fisCuvinte) throws IOException {
        citeste(fisExtensii, extensii);
        citeste(fisCuvinte, cuvinte);
    }

    // citește fișierul cu RandomAccessFile, linie cu linie
    private void citeste(String cale, Vector<String> dest) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(cale, "r");
        String linie;
        while ((linie = raf.readLine()) != null) {
            linie = linie.trim();
            if (linie.isEmpty()) {
                continue;
            }
            for (String token : linie.split("\\s+")) {
                dest.add(token.toLowerCase());
            }
        }
        raf.close();
    }

    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;                 // lăsăm directoarele, ca să putem coborî în ele
        }

        String nume = f.getName().toLowerCase();
        int p = nume.lastIndexOf('.');
        String ext = (p >= 0) ? nume.substring(p + 1) : "";
        String baza = (p >= 0) ? nume.substring(0, p) : nume;

        boolean extOk = false;
        for (String e : extensii) {
            if (e.startsWith(".")) {
                e = e.substring(1);
            }
            if (ext.equals(e)) {
                extOk = true;
                break;
            }
        }
        if (!extOk) {
            return false;
        }

        for (String c : cuvinte) {
            if (baza.contains(c)) {
                return true;
            }
        }
        return false;
    }
}

class Main {
    static void parcurge(File dir, Filtru filtru) {
        File[] lista = dir.listFiles(filtru);
        if (lista == null) {
            return;
        }
        for (File f : lista) {
            if (f.isDirectory()) {
                parcurge(f, filtru);
            } else {
                System.out.println(f.getPath());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Filtru filtru = new Filtru("extension.in", "words.in");
        File radacina = new File(args.length > 0 ? args[0] : ".");
        parcurge(radacina, filtru);
    }
}