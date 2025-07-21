package oopAbstractizare;

import org.testng.annotations.Test;

public class AbstractizareTest {

    @Test
    public void methodTest(){
        AngajatFullTime mihai = new AngajatFullTime("Vocurek","Mihai", 35, "Endava");
        mihai.mergeInConcediu();

        AngajatPartTime mihai2 = new AngajatPartTime("Vocurek2", "Mihai2",30,"Patron");
        mihai2.mergeInConcediu();
    }
}
