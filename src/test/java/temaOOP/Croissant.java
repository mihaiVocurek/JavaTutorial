package temaOOP;

public class Croissant extends Produs {

    public boolean areUmplutura;
    public String insertie;
    public boolean areMaiMulteDimensiuni;

    public Croissant(String numeProdus, int pret, char tipProdus, boolean areUmplutura,
                     String insertie, boolean areMaiMulteDimesiuni) {
        super(numeProdus, pret, tipProdus);
        this.areUmplutura = areUmplutura;
        this.insertie = insertie;
        this.areMaiMulteDimensiuni = areMaiMulteDimesiuni;
    }

    public void prezentareCroissant(){
        prezentareProdusPatiserie();
        if(areUmplutura)
        {
            System.out.println("Croissant are insert de: " + insertie);
        }
        else System.out.println("Croissant simplu");
        if(areMaiMulteDimensiuni)
        {
            System.out.println("Croissant-ul este in versiune mini si normala");
        }
        else System.out.println("Croissant-ul este doar in marime normala");
        System.out.println();
    }

}
