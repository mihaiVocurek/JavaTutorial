package teme;

import org.testng.annotations.Test;

public class Restaurant {

    public String nume;
    public String adresa;
    public int numarMese;
    public float numarSteleRecenzii;
    public boolean areTerasa;
    public double pretMediuMasaRON;
    public boolean areLivrare;
    public String meniuOnline;
    public String specific;
    public double suprafataMp;

    @Test
    public void prezentareRestaurant()
    {
        nume = "La haleala bunicica";
        adresa = "Bucuresti, sector 2";
        numarMese = 25;
        numarSteleRecenzii = 4.3f;
        areTerasa = false;
        pretMediuMasaRON = 45;
        areLivrare = true;
        meniuOnline = "www.lahalealabunicica.ro/meniu";
        specific = "romanesc";
        suprafataMp = 123.45;

        System.out.println("Nume: " + nume);
        System.out.println("Adresa: " + adresa);
        System.out.println("Numar mese: " + numarMese);
        System.out.println("Note recenzii: " + numarSteleRecenzii);
        System.out.println("Este cu terasa? " + areTerasa);
        System.out.println("Cost mediu masa (RON): " + pretMediuMasaRON);
        System.out.println("Are optiune de livrare? " + areLivrare);
        System.out.println("Meniu online: " + meniuOnline);
        System.out.println("Restaurant cu specific: " + specific);
        System.out.println("Suprafata (mp): " + suprafataMp);

    }
}
