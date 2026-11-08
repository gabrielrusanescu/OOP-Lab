import java.util.*;

class NumarNegativ extends Exception {
    public NumarNegativ() {
        super("Numarul introdus este negativ!");
    }
}

class MainApp {
    private Vector vector = new Vector();

    public void myRead() throws NumarNegativ {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int numar = scanner.nextInt();
            if (numar < 0) {
                throw new NumarNegativ();
            }
            vector.add(numar);
        }
    }

    public static void main(String[] args) {
        MainApp app = new MainApp();
        try {
            app.myRead();
        } catch (NumarNegativ e) {
            System.out.println(e.getMessage());
        }

        if (!app.vector.isEmpty()) {
            int maxim = (Integer) Collections.max(app.vector);
            System.out.println("Elementul maxim din sir este: " + maxim);
        } else {
            System.out.println("Nu s-au citit numere valide.");
        }
    }
}