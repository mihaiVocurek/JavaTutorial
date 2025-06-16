package teme;

import javax.sound.midi.Soundbank;

public class Sportiv {

    public String prenume;
    public String nume;
    public String tipSportiv;
    public int numarTrofee;
    public String numeEchipa;
    public String nationalitate;
    public int locClasamentIndividual;
    public int locClasamentEchipa;

    public Sportiv(String prenume, String nume, String tipSportiv, int numarTrofee, String nationalitate, String numeEchipa, int locClasamentEchipa) {
        this.prenume = prenume;
        this.nume = nume;
        this.tipSportiv = tipSportiv;
        this.numarTrofee = numarTrofee;
        this.nationalitate = nationalitate;
        this.numeEchipa = numeEchipa;
        this.locClasamentEchipa = locClasamentEchipa;
    }

    public Sportiv(String prenume, String nume, String tipSportiv, int numarTrofee, String nationalitate, int locClasamentIndividual) {
        this.prenume = prenume;
        this.nume = nume;
        this.tipSportiv = tipSportiv;
        this.numarTrofee = numarTrofee;
        this.nationalitate = nationalitate;
        this.locClasamentIndividual = locClasamentIndividual;
    }

    public void prezentareSportiv(){
        System.out.println("Prenumele sportivului este: " + prenume);
        System.out.println("Numele sportivului este: " + nume);
        System.out.println("Sportivul este : " + tipSportiv);
        System.out.println("Are " + numarTrofee + " trofee castigate");
        System.out.println("Este de nationalitate: " + nationalitate);

        if (numeEchipa == null) {
            System.out.println("Sportivul nu are echipa");
        } else System.out.println("Numele echipei din care face parte parte este: " + numeEchipa);

        if(locClasamentEchipa == 0){
            System.out.println("Sportivul nu are un clasament al echipei");
        } else System.out.println("Locul in campionatul intern este: " + locClasamentEchipa);

        if(locClasamentIndividual == 0){
            System.out.println("Sportivul nu are clasament indivual");
        } else System.out.println("Locul in clasamentul mondial este: " + locClasamentIndividual);
    }

}
