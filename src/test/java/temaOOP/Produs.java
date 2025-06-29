package temaOOP;

public class Produs {

    public String tipProdus;
    public int pret;
    public char categorieProdus;

    public Produs(String tipProdus, int pret, char categorieProdus) {
        this.tipProdus = tipProdus;
        this.pret = pret;
        this.categorieProdus = categorieProdus;
    }

    public void prezentareProdusPatiserie(){
        System.out.println("Tipul produsului: " + tipProdus);
        System.out.println("Pretul produsului: " + pret + " RON");
        if(categorieProdus == 'S')
        {
            System.out.println("Acesta este un produs sarat");
        }
        else if(categorieProdus == 'D') {
            System.out.println("Acesta este un produs dulce");
        }
        else System.out.println("Acest produs nu are un tip anume");
    }
}
