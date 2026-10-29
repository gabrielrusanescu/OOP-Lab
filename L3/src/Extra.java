enum TipProdus {
    ALIMENTAR, ELECTRONIC, VESTIMENTAR, ALTUL
}

record Produs(String nume, double pret, TipProdus tip) {
    public String descriere(){
        return "Nume=" + nume + ", Tip=" + tip + ", Pret=" + pret + " RON";
    }
}

class Main {
    Produs p1 = new Produs("Morcov", 5.1, TipProdus.ALIMENTAR);
    Produs p2 = new Produs("Blugi", 10.5, TipProdus.VESTIMENTAR);
    Produs p3 = new Produs("Telefon", 20.9, TipProdus.ELECTRONIC);
    Produs p4 = new Produs("Castravete", 8.2, TipProdus.ALIMENTAR);
    public void main(String[] args) {
        System.out.println(p1 + "\n" + p2 + "\n" + p3);
        System.out.println(p1.descriere());
        Produs[] lista = new Produs[4];
        lista[0] = p1; lista[1] = p2; lista[2] = p3; lista[3] = p4;
        System.out.println("\n\nProduse alimentare: ");
        for (int i = 0; i < 4; ++i) {
            if(lista[i].tip() == TipProdus.ALIMENTAR){
                System.out.println(lista[i]);
            }
        }

    }
}

public class Extra {
}
