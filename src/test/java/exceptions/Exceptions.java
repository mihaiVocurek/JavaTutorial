package exceptions;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {

    //sunt doua tipuri de exceptii: checked si unchecked
    @Test
    public void testMethod() throws FileNotFoundException {
        //printFileContent();
        //printStudents();
        //nuTigari();
        printFileContentV2();
    }

    //citim continutul dintr-un fisier
    public void printFileContent(){
        String pathFile = "Path-ul catre fisier";
        File file = new File(pathFile);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("A intrat in try");
        } catch (FileNotFoundException e) {
            System.out.println("A intrat in catch");
        } finally {
            System.out.println("A intat in finally");
        }
    }

    //definim o lista de cursanti
    public void printStudents(){
        String[] colegi = new String[2];
        colegi[0] = "Mihai";
        colegi[1] = "Andrei";
        colegi[2] = "Ioana";
        for(int index=0;index<colegi.length;index++){
            System.out.println(colegi[index]);
        }
    }

    //facem o regula de a nu vinde tigari la minori
    public void nuTigari(){
        int varsta = 19;
        if(varsta < 18){
            throw new RuntimeException("Nu vindem tigari minorilor");
        } else {
            System.out.println("Persoana este majora");
        }
    }

    //print content file v2
    public void printFileContentV2() throws FileNotFoundException {
        String pathFile = "Path-ul catre fisier";
        File file = new File(pathFile);
        FileInputStream fileInputStream = new FileInputStream(file);

    }
}
