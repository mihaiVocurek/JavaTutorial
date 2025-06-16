package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //Acesta este un comentariu.
    //Clasa = sablon specific unei entitati care contine variabile si metode.
    //Intr-un fisier java recunoastem o clasa dupa cuvantul "class".
    //O clasa trebuie sa aibe un nume, e.g. "Student".
    //Variabilele / metodele unei clase se regases intre acolade.
    //Intr-un fisier java putem avea mai multe clase diferentiate prin nume.
    //Nu este un practice bun sa avea mai multe clase intr-un fisier java.
    //Variabila = proprietatea unei clase.
    //Variabilele pot fi de doua feluri: globale si locale.
    //Variabila globala = variabila care este prezenta peste tot in fisierul java.
    //Variabila globala = public tipVariabila numeVariabila.
    //O variabila poate sau nu sa primeasca o valoare.
    //Variabila locala = variabila care este prezenta doar in locul in care a fost definita.
    //Variabila locala = tipVariabila numeVariabila.
    //Metoda = actiunea unei clase.
    //Metodele pot sa fie de doua feluri: void si return.
    //Metoda void = metoda care afiseaza rezultatul codului scris.
    //Metoda void = public void numeMetoda(){}.

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areBursa;

    @Test
    public void prezentareStudent()
    {
        nume = "Vocurek";
        prenume = "Mihai";
        varsta = 34;
        adresa = "Bucuresti, sector 3";
        inaltime = 1.78;
        greutate = 80.53f;
        sex = 'M';
        areBursa = false;

        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("Varsta: " + varsta);
        System.out.println("Adresa: " + adresa);
        System.out.println("Inaltime: " + inaltime);
        System.out.println("Greutate: " + greutate);
        System.out.println("Sexul: " + sex);
        System.out.println("Beneficiaza de bursa? " + areBursa);

    }

    //sa imi aleg o clasa cu 10 variabile
    //plus o metoda de test si afisare valori

}