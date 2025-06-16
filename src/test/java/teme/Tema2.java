package teme;

import org.testng.annotations.Test;

public class Tema2 {

    @Test
    public void testMethod()
    {
//        cinciDaPeAcelasiRand();//punctul 1
//        System.out.println();
//        treiNumere();//punctul 2
//        System.out.println();
//        numarMaxim(15,20);//punctul 3
//        numarMaxim(78,21);//punctul 3
//        numarMaxim(100,100);//punctul 3
//        numarMinim(4.5,3.25);//punctul 4
//        numarMinim(6.78,9.12);//punctul 4
//        numarMinim(2.33,2.33);//punctul 4
        afisareNrPareImpare(10);//punctul 5
//        System.out.println();
//        afisareNrPare(10);//punctul 6
//        System.out.println();
//        afisareNrDivizibileCuCinci(37);//punctul 7
//        System.out.println();
//        afisarePrimeleTreiNrDivizibileCuCinci(37);//punctul 8
//        System.out.println();
//        sumaDouaNumere(235,10);//punctul 9
//        sumaNumerelorPanaLaZece();//punctul 10
//        produsulNumerelorPanaLaCinci();//punctul 11
    }
    //punctul 1
    public void cinciDaPeAcelasiRand()
    {
        int index = 0;
        while (index < 5)
        {
            System.out.print("DA ");
            index++;
        }
    }
    //punctul 2
    public void treiNumere()
    {
        for(int index = 1; index < 4; index++){
            System.out.print(index + " ");
        }
    }
    //punctul 3
    public void numarMaxim(int nr1, int nr2){
        if (nr1 > nr2){
            System.out.println("Numarul maxim este: " + nr1);
        } else if (nr1 < nr2) {
            System.out.println("Numarul maxim este: " + nr2);
        } else {
            System.out.println("Numerele sunt egale!");
        }
    }
    //punctul4
    public void numarMinim(double nr1, double nr2){
        if (nr1 < nr2){
            System.out.println("Numarul minim este: " + nr1);
        } else if (nr2 < nr1) {
            System.out.println("Numarul minim este: " + nr2);
        } else {
            System.out.println("Numerele sunt egale!");
        }
    }
    //punctul5
    public void afisareNrPareImpare(int nr){
        System.out.print("Numerele pare sunt: ");
        for (int index = 0; index < nr; index++){
            if(index % 2 == 0){
                System.out.print(index + " ");
            }
        }
        System.out.println();
        System.out.print("Numerele impare sunt: ");
        for (int index = 0; index < nr; index++){
            if(index % 2 == 1){
                System.out.print(index + " ");
            }
        }
    }
    //punctul6
    public void afisareNrPare(int nr){
        System.out.print("Numerele pare sunt: ");
        for (int index = 0; index < nr; index++){
            if(index % 2 == 0){
                System.out.print(index + " ");
            }
        }
    }
    //punctul7
    public void afisareNrDivizibileCuCinci(int nr){
        System.out.print("Numerele divizibile cu 5 sunt: ");
        for (int index = 0; index < nr; index++){
            if(index % 5 == 0){
                System.out.print(index + " ");
            }
        }
    }
    //punctul8
    public void afisarePrimeleTreiNrDivizibileCuCinci(int nr){
        System.out.print("Primele 3 numerele divizibile cu 5 sunt: ");
        int counter = 0;
        for (int index = 0; index < nr; index++){
            if(index % 5 == 0){
                System.out.print(index + " ");
                counter++;
            }
            if(counter == 3) {
                break;
            }
        }
    }
    //punctul 9
    public void sumaDouaNumere(int nr1, int nr2){
        int suma = nr1 + nr2;
        System.out.println("Suma celor doua numere este: " + suma);
    }
    //punctul 10
    public void sumaNumerelorPanaLaZece(){
        int index = 0;
        int suma = 0;
        while (index < 10){
            suma += index;
            index++;
        }
        System.out.println("Suma numerelor pana la 10 este: " + suma);
    }
    //punctul 11
    public void produsulNumerelorPanaLaCinci(){
        int index = 1;
        int produs = 1;
        while(index < 5)
        {
            produs*=index;
            index++;
        }
        System.out.println("Produsul numerelor pana la 5 este: " + produs);
    }
}
