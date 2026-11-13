import java.util.Collections;
import java.util.Vector;

interface Persoana extends Comparable {
    public double calculMedieGenerala();
    public String getNume();
    public void setNume(String nume);
    public void addMedie(double medie);
}

class Student implements Persoana {
    private String nume;
    private Vector<Double> medii;

    Student(String nume) {
        this.nume = nume;
        this.medii = new Vector<Double>();
    }

    public double calculMedieGenerala() {
        if (medii.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Double m : medii) {
            suma += m;
        }
        return suma / medii.size();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void addMedie(double medie) {
        medii.add(medie);
    }

    public int compareTo(Object o) {
        Student s = (Student) o;
        int rez = nume.compareTo(s.nume);
        if (rez != 0) {
            return rez;                      // nume crescător
        }
        // același nume: cel cu media mai mare e primul
        return Double.compare(s.calculMedieGenerala(), calculMedieGenerala());
    }

    public String toString() {
        return nume + " " + calculMedieGenerala();
    }
}

class Main {
    public static void main(String[] args) {
        Vector<Student> studenti = new Vector<Student>();

        Student s1 = new Student("Popescu");
        s1.addMedie(8.5);
        s1.addMedie(9.0);

        Student s2 = new Student("Ionescu");
        s2.addMedie(7.0);
        s2.addMedie(6.5);

        Student s3 = new Student("Popescu");
        s3.addMedie(9.5);
        s3.addMedie(10.0);

        Student s4 = new Student("Anton");
        s4.addMedie(10.0);

        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);
        studenti.add(s4);

        Collections.sort(studenti);

        for (Student s : studenti) {
            System.out.println(s);
        }
    }
}