import java.util.Vector;

interface UsiAutomate {
    void deschideUsi();
    void inchideUsi();
}

interface GeamuriAutomate {
    void blocheazaGeamuri();
}

abstract class Vagon {
    public abstract int getNrPasageri();
    public abstract int getNrColete();
}

class CalatoriA extends Vagon implements UsiAutomate {
    public int getNrPasageri() {
        return 40;
    }
    public int getNrColete() {
        return 300;
    }
    public void deschideUsi() {
        System.out.println("CalatoriA: usile se deschid automat");
    }
    public void inchideUsi() {
        System.out.println("CalatoriA: usile se inchid automat");
    }
}

class CalatoriB extends Vagon implements UsiAutomate, GeamuriAutomate {
    public int getNrPasageri() {
        return 50;
    }
    public int getNrColete() {
        return 400;
    }
    public void deschideUsi() {
        System.out.println("CalatoriB: usile se deschid automat");
    }
    public void inchideUsi() {
        System.out.println("CalatoriB: usile se inchid automat");
    }
    public void blocheazaGeamuri() {
        System.out.println("CalatoriB: geamurile se blocheaza automat");
    }
}

class Marfa extends Vagon {
    public int getNrPasageri() {
        return 0;
    }
    public int getNrColete() {
        return 400;
    }
}

class Tren implements Comparable<Tren> {
    private Vector<Vagon> vagoane = new Vector<Vagon>();

    public void addVagon(Vagon v) {
        vagoane.add(v);
    }

    public int getNrColete() {
        int total = 0;
        for (Vagon v : vagoane) {
            total += v.getNrColete();
        }
        return total;
    }

    public int compareTo(Tren t) {
        return Integer.compare(getNrColete(), t.getNrColete());
    }

    public boolean equals(Object o) {
        if (!(o instanceof Tren)) {
            return false;
        }
        return compareTo((Tren) o) == 0;
    }

    public int hashCode() {
        return getNrColete();
    }

    // afișează fiecare tip de vagon o singură dată
    public void afiseazaTipuri() {
        Vector<String> tipuri = new Vector<String>();
        for (Vagon v : vagoane) {
            String nume = v.getClass().getSimpleName();
            if (!tipuri.contains(nume)) {
                tipuri.add(nume);
            }
        }
        System.out.println("Tipuri de vagoane: " + tipuri);
    }

    // exemplu de folosire a serviciilor, doar pentru vagoanele care le au
    public void deschideToateUsile() {
        for (Vagon v : vagoane) {
            if (v instanceof UsiAutomate) {
                ((UsiAutomate) v).deschideUsi();
            } else {
                System.out.println(v.getClass().getSimpleName() + ": usile se deschid manual");
            }
        }
    }
}

class Test05 {
    public static void main(String[] args) {
        Tren t1 = new Tren();
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriB());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new Marfa());

        Tren t2 = new Tren();
        t2.addVagon(new CalatoriB());
        t2.addVagon(new Marfa());
        t2.addVagon(new Marfa());
        t2.addVagon(new Marfa());

        t1.afiseazaTipuri();
        t1.deschideToateUsile();

        Vagon v = new CalatoriB();
        if (v instanceof GeamuriAutomate) {
            ((GeamuriAutomate) v).blocheazaGeamuri();
        }

        System.out.println("t1: " + t1.getNrColete() + " colete");
        System.out.println("t2: " + t2.getNrColete() + " colete");
        System.out.println("t1 == t2 ? " + t1.equals(t2));
        System.out.println("t1.compareTo(t2) = " + t1.compareTo(t2));
    }
}