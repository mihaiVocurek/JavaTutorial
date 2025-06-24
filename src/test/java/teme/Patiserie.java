package teme;

public class Patiserie {

    public String numeProdus;
    public int pret;
    public char tipProdus;

    public Patiserie(String numeProdus, int pret, char tipProdus) {
        this.numeProdus = numeProdus;
        this.pret = pret;
        this.tipProdus = tipProdus;
    }

    public void prezentareProdusPatiserie(){
        System.out.println("Numele produsului: " + numeProdus);
        System.out.println("Pretul produsului: " + pret);
        if(tipProdus == 'S')
        {
            System.out.println("Acesta este un produs sarat");
        }
        else if(tipProdus == 'D') {
            System.out.println("Acesta este un produs dulce");
        }
        else System.out.println("Acest produs nu are un tip anume");
    }
}
