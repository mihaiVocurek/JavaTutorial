package staticConcept;

import org.testng.annotations.Test;

public class staticTest {

    @Test
    public void testMethod(){

        Elev mihai = new Elev("Iahim", "Mihai");
        mihai.prezentareElev();

        //Elev.scoala = "Tudor Arghezi";

        Elev andrei = new Elev("Ierdna", "Andrei");
        andrei.prezentareElev();

        Elev cosmin = new Elev("Nimsoc", "Cosmin");
        cosmin.prezentareElev();
    }
}
