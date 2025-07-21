package oopIncapsularePolimorfism;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OOPTest {

    @Test
    public void testMethod(){
        List<String> dotariExterioareLogan = Arrays.asList("Senzori parca", "Camera video", "Jante 18 inch");
        Dacia logan = new Dacia("Dacia","Logan","argintiu",
                100,12000, dotariExterioareLogan);

        //logan.prezentareComandaDacia();

        logan.setCuloare("Rosu");
        logan.setModel("Sandero");
        logan.setDotariExterioare(Arrays.asList("Volan incalzit", "Clima bizonica"));

        logan.prezentareComandaDacia();
        logan.pornesteMotor();

        logan.procesarePlata();
        logan.procesarePlata(true);
        logan.procesarePlata(10);

//        System.out.println();
//
//        List<String> dotariInterioareSenna = Arrays.asList("Bord carbon", "Infotainment", "Ceas analogic");
//        List<String> dotariExterioareSenna = Arrays.asList("Eleron spate", "Spoiler reglabil", "Capota perforata");
//        McLaren senna = new McLaren("McLaren", "Senna", "portocaliu",
//                500, 500000, dotariInterioareSenna, dotariExterioareSenna);
//        senna.prezentareComandaMcLaren();
//        senna.pornesteMotor();
    }
}
