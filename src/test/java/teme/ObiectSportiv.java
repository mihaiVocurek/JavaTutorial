package teme;

import org.testng.annotations.Test;

public class ObiectSportiv {

    @Test
    public void testMethod(){
        Sportiv tenisman = new Sportiv("Kerucov","Iahim","jucator de tenis",15,"romana",25);
        Sportiv fotbalist = new Sportiv("Vocurek", "Nailui","jucator de fotbal",5,"ceha","Slavia Praga", 2);

        //tenisman.prezentareSportiv();
        //System.out.println();
        //fotbalist.prezentareSportiv();

        tenisman.nume = "Kerucov";
        tenisman.prenume = "Iahim";

        fotbalist.nume = "Vocurek";
        fotbalist.prenume = "Nailui";

        tenisman.prezentareSportiv();
        System.out.println();
        fotbalist.prezentareSportiv();

    }




}
