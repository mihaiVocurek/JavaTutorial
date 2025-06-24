package teme;

public class Saratele extends Patiserie{

    public String seminte;
    public String forma;

    public Saratele(String numeProdus, int pret, char tipProdus, String seminte, String forma) {
        super(numeProdus, pret, tipProdus);
        this.seminte = seminte;
        this.forma = forma;
    }

    public void prezentareSaratele(){
        prezentareProdusPatiserie();
        System.out.println("Saratele sunt cu: " + seminte);
        System.out.println("Au forma de: " + forma);
        System.out.println();
    }
}
