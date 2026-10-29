class Produs{
    String nume;
    double pret;
    int cantitate;
    Produs(){
        nume="";
        pret=0.0;
        cantitate=0;
    }
    Produs(String n, double p, int c){
        nume=n;
        pret=p;
        cantitate=c;
    }
    public String toString(){
        return new String("Produs " + nume + " " + pret + " " + cantitate);
    }
    public double getTotalProdus(){
        return (double)cantitate * pret;
    }
}
class Magazin{
    String nume;
    Produs unu, doi, trei;
    Magazin(){
        nume="";
        unu = null;
        doi = null;
        trei = null;
    }
    Magazin(String nume, Produs unu, Produs doi, Produs trei){
        this.nume = nume;
        this.unu = unu;
        this.doi = doi;
        this.trei = trei;
    }
    public String toString(){
        return new String(nume + " p1: " + unu + " p2: " + doi + " p3: " + trei);
    }
    public double getTotalMagazin(){
        return unu.pret + doi.pret + trei.pret;
    }
    public static void main(String[] args){
        Magazin x = new Magazin("Albina", new Produs("ceai", 5.5, 1), new Produs("carne", 10, 2), new Produs("planta", 12.4, 5));
        System.out.println(x.getTotalMagazin());
    }
}

public class Prob2 {
}
