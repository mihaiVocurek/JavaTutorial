package oopIncapsularePolimorfism;

import java.util.List;

public class Dacia extends Masina {

    private List<String> dotariExterioare;

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

    public void procesarePlata(){
        System.out.println("Plata pentru masina Dacia se proceseaza cu suma de " + getPret());
    }

    public void procesarePlata(boolean buyBack){
        System.out.println("Plata pentru masina Dacia este influentata de optiunea de buyback");
    }

    public void procesarePlata(int procent){
        System.out.println("Plata pentru masina Dacia vine cu o reducere de " + procent + "%");
    }


    public void pornesteMotor(){
        System.out.println("Masina Dacia porneste motorul electric");
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }
}
