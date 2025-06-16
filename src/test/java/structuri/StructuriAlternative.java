package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri alternative: IF (conditie 1...conditie N) THEN ... ELSE, SWITCH..CASE
    //Putem avea mai multe conditii intre paranteze care se delimiteaza folosind operatorii logici: &&,||,!
    //Nu este obligatoriu ca un IF sa aibe ELSE
    //Putem adauga mai multe structuri de tipul IF cu ajutorul lui ELSE folosind ELSE IF

    @Test
    public void testMethod() {
//        celMaiMareNumar(56,66);
//        celMaiMareNumar(23,13);
//        celMaiMareNumar(5,5);
//        celMaiMareNumar(-50,-40);
//        celMaiMareNumar(0,-20);

//        numarPar(22);
//        numarPar(35);
//        numarPar(0);
//        numarPar(-10);
//        numarPar(-13);

//        numarParV2(22);
//        numarParV2(35);
//        numarParV2(0);
//        numarParV2(-10);
//        numarParV2(-13);

//        lungimeParola("qwertyu");//7
//        lungimeParola("qwertyui");//8
//        lungimeParola("qwertyuio");//9
//
//        lungimeParola("asdfghjklzxcvb");//14
//        lungimeParola("asdfghjklzxcvbn");//15
//        lungimeParola("asdfghjklzxcvbnm");//16
//
//        lungimeParola("");//0

        lungimeParolaV2("A5^sfdds");
        lungimeParolaV2("sfddsghfhfgh");

    }

    //Verificam care este numarul cel mai mare dintre doua valori
    public void celMaiMareNumar(int nr1, int nr2) {
        if (nr1 > nr2) {
            System.out.println("Cel mai mare numar dintre " + nr1 + " si " + nr2 + " este: " + nr1);
        } else {
            System.out.println("Cel mai mare numar dintre " + nr1 + " si " + nr2 + " este: " + nr2);
        }
    }

    //Verificam daca un numar este par
    //Daca vrem sa lucram cu catul unei impartiri folosim / (divide)
    //Daca vrem sa lucram cu restul unei impartiri folosim % (modulo)
    public void numarPar(int nr) {
        if (nr % 2 == 0) {
            System.out.println("Numarul " + nr + " este par");
        } else {
            System.out.println("Numarul " + nr + " este impar");
        }
    }

    //Verificam daca un numar este par si pozitiv
    public void numarParV2(int nr) {

        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este par si pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este impar si pozitiv");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este par si negativ");
            } else {
                System.out.println("Numarul " + nr + " este impar si negativ");
            }
        } else {
            System.out.println("Numarul este zero");
        }
    }

    //Verificam daca lungimea unei parole este cuprinsa intre 8 si 15 caractere
    public void lungimeParola(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            System.out.println("Parola " + parola + " are lungimea intre 8 si 15 caractere");
        } else {
            System.out.println("Parola " + parola + " nu are lungimea intre 8 si 15 caractere");
        }
    }

    //Adaugam extra verificari legat de continutul parolei
    //Aceste verificati se focuseaza pe faptul ca parola trebuie sa contina un caracter cu litera mare, cifra si un caracter special
    public void lungimeParolaV2(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            if (parola.matches(".*[A-Z].*") && parola.matches(".*[0-9].*") && parola.matches(".*[!@#$%^&*()\"{}\\[\\]||].*")) {
                System.out.println("Parola " + parola + " contine litera mare, cifra si caracter special");
            } else {
                System.out.println("Parola " + parola + " trebuie sa contina litera mare, cifra si caracter special");
            }
        } else {
            System.out.println("Parola " + parola + " nu are lungimea intre 8 si 15 caractere");
        }
    }
}
