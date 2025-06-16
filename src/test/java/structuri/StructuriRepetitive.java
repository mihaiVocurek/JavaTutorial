package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    //Structuri repetitive = for, while, foreach

    @Test
    public void testMethod(){
        //afisareNumere();
        //afisareNumereWhile();
        //afisareNumerePareV2();
        //afisareDivizibilCu3();
        //afisarePrimeleCinci();
        calculareSuma();
    }

    //Afisam primele 50 de numere incepand de la 0
    public void afisareNumere(){
        for (int index=0; index<100; index++){
            System.out.println("Valoare curenta este: "+index);
        }
    }

    public void afisareNumereWhile(){
        int index = 0;
        while (index < 100){
            System.out.println("Valoare cureste este: "+index);
            index++;
        }
    }

    //Afisam numerele pare de la 0 la 50
    public void afisareNumerePare(){
        for (int index = 0; index < 50; index=index+2){
                System.out.println("Numarul par este: "+ index);
        }
    }

    public void afisareNumerePareV2(){
        for (int index = 0; index < 50; index++){
            if(index % 2 == 0) {
                System.out.println("Numarul par este: " + index);
            }
        }
    }

    //Afisam numerele divizibile cu 3 de la 0 la 50
    public void afisareDivizibilCu3(){
        int index = 0;
        while(index < 50){
            if (index % 3 == 0){
                System.out.println("Numarul divizibil cu 3 este: " + index);
            }
            index++;
        }
    }

    //Afisam primele 5 numere divizibile cu 5 de la 0 la 50
    public void afisarePrimeleCinci(){
        int counter = 0;
        for(int index=0;index<50;index++){
            if(index % 5 ==0){
                System.out.println("Numar divizibil cu 5: "+ index);
                counter++;
            }
            if (counter == 5){
                break;
            }
        }
    }

    //Calculam suma cifrelor pana la 10
    public void calculareSuma(){
        int suma = 0;
        for(int index = 0; index < 10; index++){
            suma += index;
            //suma = suma + index;
        }
        System.out.println("Suma este: " + suma);
    }

}
