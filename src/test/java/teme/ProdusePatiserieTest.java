package teme;

import org.testng.annotations.Test;

public class ProdusePatiserieTest {

    @Test
    public void testMethod(){
        Patiserie merdeneaMea = new Patiserie("Merdenea",7,'S');
        Patiserie cornulMeu = new Patiserie("Corn", 5, 'D');
        Patiserie paineaMea = new Patiserie("Paine", 3, 'P');

        Saratele sarateleMele = new Saratele("Saratele", 3, 'S', "susan", "spirala");
        sarateleMele.prezentareSaratele();
        Placinta placintaMea = new Placinta("Placinta", 20, 'S',"ciuperci", true, 500);
        placintaMea.prezentarePlacinta();

        Strudel strudelulMeu = new Strudel("Strudel",4,'D',"mere", false);
        strudelulMeu.prezentareStrudel();
        Croissant croissantulMeu = new Croissant("Croissant", 6,'D',true,"cacao", false);
        croissantulMeu.prezentareCroissant();

        Strudel strudelulTau = new Strudel("Strudel", 4,'D',"dovleac",true);
        strudelulTau.prezentareStrudel();
        Croissant croissantulTau = new Croissant("Croissant", 6, 'D', false,"",true);
        croissantulTau.prezentareCroissant();

    }

}
