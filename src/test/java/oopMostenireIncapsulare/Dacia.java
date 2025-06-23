package oopMostenireIncapsulare;

import java.util.List;

public class Dacia extends Masina{

    public List<String> dotariExterioare;

    public Dacia(String marca, String model, String culoare, int caiPutere, int pret,
                 List<String> dotariExterioare) {
        super(marca, model, culoare, caiPutere, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareComandaDacia(){
        prezentareComandaMasina();
        System.out.println("Dotari exterioare Dacia: ");
        for(int index=0;index<dotariExterioare.size();index++)
        {
            System.out.println(index + ". " + dotariExterioare.get(index));
        }
    }
}
