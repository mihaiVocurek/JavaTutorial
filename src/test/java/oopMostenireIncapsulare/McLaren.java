package oopMostenireIncapsulare;

import java.util.List;

public class McLaren extends Masina {

    public List<String> dotariInterioare;
    public List<String> dotariExterioare;

    public McLaren(String marca, String model, String culoare, int caiPutere, int pret,
                   List<String> dotariInterioare, List<String> dotariExterioare) {
        super(marca, model, culoare, caiPutere, pret);
        this.dotariInterioare = dotariInterioare;
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareComandaMcLaren(){
        prezentareComandaMasina();

        System.out.println("Dotari interioare McLaren: ");
        for(int index=0;index<dotariInterioare.size();index++)
        {
            System.out.println(index + ". " + dotariInterioare.get(index));
        }

        System.out.println("Dotari exterioare McLaren: ");
        for(int index=0;index<dotariInterioare.size();index++)
        {
            System.out.println(index + ". " + dotariInterioare.get(index));
        }
    }



}
