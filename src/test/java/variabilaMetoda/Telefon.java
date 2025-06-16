package variabilaMetoda;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

public class Telefon {

    public String model;
    public String marca;
    public String culoare;
    public double pret;
    public String caracteristici;

    @Test
    public void testMethod()
    {
        prezentareTelefon("16 Pro Max", "iPhone", "negru", 123.45,"stare buna");
        discountTelefon();
        System.out.println();
        prezentareTelefon("14 Pro Max", "iPhone", "alb", 123.45,"stare noua");
        System.out.println();
        prezentareTelefon("Galaxy S20", "Samsung", "gri", 67.89, "in reparatie");
        System.out.println();
    }

    //Metodele pot sau nu sa contina parametrii
    //Scopul parametrilor este sa defineasca intr-un mod generic o anumita actiune
    //O metoda poate avea unul sau mai multi parametrii delimitati prin virgula
    //Un parametru trebuie sa contina tipul si numele acestuia

    public void prezentareTelefon(String param1, String param2, String param3, double param4, String param5)
    {
        model = param1;
        marca = param2;
        culoare = param3;
        pret = param4;
        caracteristici = param5;

        System.out.println("Modelul telefonului este: " + model);
        System.out.println("Marca telefonului este: " + marca);
        System.out.println("Culoarea telefonului este: " + culoare);
        System.out.println("Pretul este: " + pret);
        System.out.println("Are caracteristicile: " + caracteristici);
    }

    //Exemplu variabila locala
    public void discountTelefon()
    {
        int discount = 10;
        System.out.println("Pretul initial al telefonului este: " + pret);
        double pretFinal = pret - (pret*discount)/100;
        System.out.println("Pretul final este: " + pretFinal);
    }


}
