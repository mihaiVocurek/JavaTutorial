package temaOOP;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PatiserieTest {

    @Test
    public void testMethod(){
        Croissant croissantSimplu = new Croissant("Croissant",5,'A', false,"",true);
        Croissant croissantCiocolata = new Croissant("Croissant",7,'D', true,"crema ciocolata",false);
        Croissant croissantGem = new Croissant("Croissant",6,'D', true,"gem caise",false);
        Croissant croissantBranzaSarata = new Croissant("Croissant",8,'S', true,"branza",false);
        Croissant croissantRosiiUscate = new Croissant("Croissant",9,'S', true,"rosii uscate",false);
        List<Croissant> croissanteVitrina = Arrays.asList(croissantSimplu, croissantCiocolata, croissantGem, croissantBranzaSarata, croissantRosiiUscate);

        Placinta placintaMere = new Placinta("Placinta", 15,'D',"mere",false,150);
        Placinta placintaDovleac = new Placinta("Placinta", 15,'D',"dovleac",true,150);
        Placinta placintaVarza = new Placinta("Placinta", 15,'S',"varza",true,150);
        Placinta placintaDobrogeana = new Placinta("Placinta", 15,'S',"branza sarata",false,150);
        List<Placinta> placinteVitrina = Arrays.asList(placintaMere, placintaDovleac, placintaVarza, placintaDobrogeana);

        Saratele sarateleSusan = new Saratele("Saratele", 10,'S',"susan", "bete");
        Saratele sarateleMac = new Saratele("Saratele", 10,'S',"mac", "spirale");
        Saratele sarateleChimen = new Saratele("Saratele", 10,'S',"chimen", "covrigei");
        List<Saratele> sarateleVitrina = Arrays.asList(sarateleSusan, sarateleMac, sarateleChimen);

        Strudel strudelMere = new Strudel("Strudel", 12, 'D', "mere", false);
        Strudel strudelVisine = new Strudel("Strudel", 12, 'D', "visine", true);
        Strudel strudelBranzaDulce = new Strudel("Strudel", 12, 'D', "branza dulce", true);
        List<Strudel> strudeleVitrina = Arrays.asList(strudelMere, strudelVisine, strudelBranzaDulce);

        Patiserie produsePatiserie = new Patiserie(croissanteVitrina, placinteVitrina, sarateleVitrina, strudeleVitrina);
        produsePatiserie.prezentarePatiserie();
    }

}
