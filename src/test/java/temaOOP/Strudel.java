package temaOOP;

public class Strudel extends Produs {

    public String umplutura;
    public boolean continZahar;

    public Strudel(String numeProdus, int pret, char tipProdus, String umplutura, boolean continZahar) {
        super(numeProdus, pret, tipProdus);
        this.umplutura = umplutura;
        this.continZahar = continZahar;
    }

    public void prezentareStrudel(){
        prezentareProdusPatiserie();
        System.out.println("Strudelul este cu: " + umplutura);
        if(continZahar)
        {
            System.out.println("Contine zahar rafinat");
        }
        else {
            System.out.println("Este fara zahar adaugat");
        }
        System.out.println();
    }
}
