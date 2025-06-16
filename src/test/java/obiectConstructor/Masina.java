package obiectConstructor;

import javax.sound.midi.Soundbank;

public class Masina {

    //constructor = are rol sa initializeze atributele unei clase
    //recunoastem un constructor intr-o clasa dupa numele clasei care este la fel ca constructorul
    //un contructor poate sa fie public, private, protected urmat de acelasi nume cu clasa
    //intr-o clasa putem sa avem mai multi constructori diferentiati prin numarul sau tipul de parametrii
    //obiect = instanta a unei clase care contine proprietatile si metodele acesteia
    //dintr-o clasa putem sa creem o multime de obiecte diferentiate prin numele acestora
    //in momentul cand se initializeaza un obiect, folosim cuvantul 'new' urmat de apelarea contructorului din clasa
    //ex: Masina mihaiMercedes = new Masina("Mercedes", "EQA");
    //in momentul cand am initializat un obiect, pe baza lui putem sa accesam proprietatile si metodele din clasa respectiva
    //in momentul cand creeam un obiect, se aloca spatiu in memorie special pt aceasta reprezentare

    public String marca;
    public String model;
    public String consum;
    public String culoare;
    public int caiPutere;
    public int greutate;
    public int nrKm;
    public int pret;

    public Masina(String marca, String model, String consum, String culoare, int caiPutere, int greutate, int nrKm) {
        this.marca = marca;
        this.model = model;
        this.consum = consum;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
        this.greutate = greutate;
        this.nrKm = nrKm;
    }

    public Masina(String marca, String model, String consum, String culoare, int caiPutere, int greutate, int nrKm, int pret) {
        this.marca = marca;
        this.model = model;
        this.consum = consum;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
        this.greutate = greutate;
        this.nrKm = nrKm;
        this.pret = pret;
    }

    public void prezentareComandaMasina(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Consumul masinii este: " + consum);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Masina are " + caiPutere + " cai putere");
        System.out.println("Greutatea masinii este: " + greutate + " kg");
        System.out.println("Kilometrajul masinii este: " + nrKm + " km");
        if(pret > 0)
        {
            System.out.println("Pretul masinii este: " + pret + " euro");
        }
    }

    //daca greutatea este pana in 2000 , trebuie sa platim 5 lei
    //daca greutatea este cuprinsa intre 2000 si 4000 , trebuie sa platim 10 lei
    //daca greutatea este peste 4000, trebuie sa platim 15 lei

    public void taxaGreutate(){
        if(greutate < 2000){
            System.out.println("Taxa pe greutate este de 5 lei");
        } else if(greutate > 4000) {
            System.out.println("Taxa pe greutate este de 15 lei");
        } else System.out.println("Taxa pe greutate este de 10 lei");
    }
}
