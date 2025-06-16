package teme;

import org.testng.annotations.Test;

public class Tema1 {
    public String helloWorld = "Hello World";
    public int varsta = 34;
    public String nume = "Vocurek";
    public String prenume = "Mihai";
    public char literaM = 'M';
    public char literaH = 'H';
    public char literaZ = 'Z';
    public String evaluare = " Poti pleca acasa dupa ce iti verific munca!";

    public int salariuAngajat = 5000;
    public String prenumeAngajat = "Andrei";

    public int idAngajat = 2345;
    public String departamentAngajat = "Finance";
    public String numeAngajat = "Popescu";

    public double rezultat = (double) (2 + 3 * 4 - 3)/3;

    @Test
    public void testMethod(){
        //punctul 1
        System.out.println(helloWorld);
        System.out.println(evaluare);//punctul 7
        //punctul 2
        System.out.println("Varsta mea este: " + varsta);
        System.out.println(evaluare);//punctul 7
        //punctul 3
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(evaluare);//punctul 7
        //punctul 4
        System.out.println("Salut" + literaM);
        System.out.println(evaluare);//punctul 7
        //punctul 5
        System.out.println(literaH + "Hello");
        System.out.println(evaluare);//punctul 7
        //punctul 6
        System.out.println("Ana"+literaZ+" are"+literaZ+" mere"+literaZ+",pere"+literaZ+",prune"+literaZ);
        System.out.println(evaluare);//punctul 7
        //punctul 8
        if (prenumeAngajat == "Andrei")
        {
            System.out.println("Salariul angajatului este: " + salariuAngajat);
        }
        //punctul 9
        if (numeAngajat == "Popescu")
        {
            System.out.println("ID-ul angajatului este: " + idAngajat);
            System.out.println("Departamentul din care face parte este: " + departamentAngajat);
        }
        //punctul 10
        numarDepartament(286);
        numarDepartament(287);
        numarDepartament(288);
        //bonus
        System.out.println("Rezulatul corect este: " + rezultat);
    }

    public void numarDepartament (int numar){
        if (numar > 287)
        {
            System.out.println("Numarul departamentului este: " + numar);
        } else {
            System.out.println("Acest numar nu este valid!");
        }
    }
}
