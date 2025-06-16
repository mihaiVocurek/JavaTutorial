package obiectConstructor;

import org.testng.annotations.Test;

public class ObiectTest {

    @Test
    public void testMethod(){
        Masina mihaiMercedes = new Masina("Mercedes", "CLA","10l/100km","negru", 250, 5000, 50000);
        mihaiMercedes.prezentareComandaMasina();
        mihaiMercedes.taxaGreutate();

        System.out.println();

        Masina mihaiMazda = new Masina("Mazda", "CX-30","8l/100km","gri", 200, 1500, 75000);
        mihaiMazda.prezentareComandaMasina();

        System.out.println();

        mihaiMazda.culoare = "rosu";
        mihaiMazda.model = "RX6";
        mihaiMazda.prezentareComandaMasina();
        mihaiMazda.taxaGreutate();

        System.out.println();

        Masina mihaiMitsubishi = new Masina("Mitsubishi","Lancer", "15l/100km","galben",300,2500,100000, 10000);
        mihaiMitsubishi.prezentareComandaMasina();
        mihaiMitsubishi.taxaGreutate();

        //tema 3 -> facem o clasa Sportiv : nume , prenume, tipSportiv, trofee
        // apoi facem SportivTest cu obiectele respective
        // facem pe sporturi de echipe sau sporturi individuale
        //ex metoda parcursSportiv , e diferit pt tenis si pt fotbal
    }
}
