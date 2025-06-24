package teme;


import javax.sound.midi.Soundbank;

public class Placinta extends Patiserie {

    public String umplutura;
    public boolean esteDePost;
    public int gramaj;

    public Placinta(String numeProdus, int pret, char tipProdus, String umplutura, boolean esteDePost, int gramaj) {
        super(numeProdus, pret, tipProdus);
        this.umplutura = umplutura;
        this.esteDePost = esteDePost;
        this.gramaj = gramaj;
    }

    public void prezentarePlacinta(){
        prezentareProdusPatiserie();
        System.out.println("Umplutura de: " + umplutura);
        if(esteDePost)
        {
            System.out.println("Placinta este de post");
        }
        else System.out.println("Placinta nu este de post");

        System.out.println("Placinta are " + gramaj + " grame");
        System.out.println();
    }
}
