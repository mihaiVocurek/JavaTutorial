package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {
    //Multimi = array, list(arrayList), map

    @Test
    public void testMethod(){
        //colegiCurs();
        //multimeFructeLista();
        obiectiveTuristiceV3();
    }

    //Afisam numele colegilor de la curs
    public void colegiCurs(){
        String[] colegi = new String[10];
        colegi[0] = "Mihai";
        colegi[1] = "Alex";
        colegi[2] = "Roxana";
        colegi[3] = "Radu";
        colegi[4] = "Virgil";
        for(int index=0;index<colegi.length;index++){
            System.out.println("Numele colegului este: " + colegi[index]);
        }
    }

    public void colegiCursLista(){
        List<String> colegiCurs = new ArrayList<>();
        colegiCurs.add("Mihai");
        colegiCurs.add("Alex");
        colegiCurs.add("Roxana");
        colegiCurs.add("Radu");
        colegiCurs.add("Virgil");
        for(int index=0;index<colegiCurs.size();index++){
            System.out.println("Numele colegului este: " + colegiCurs.get(index));
        }
    }

    //Afisam o multime de fructe
    public void multimeFructe(){
        String[] fructe = new String[5];
        fructe[0] = "mar";
        fructe[1] = "para";
        fructe[2] = "strugure";
        fructe[3] = "mango";
        fructe[4] = "cirese";
        for(int index=0;index<fructe.length;index++){
            System.out.println("Numele fructelor sunt: " + fructe[index]);
        }
    }

    //Afisam o multime de fructe - V2 lista
    public void multimeFructeLista(){
        List<String> fructe = new ArrayList<>();
        fructe.add("mar");
        fructe.add("para");
        fructe.add("strugure");
        fructe.add("mango");
        fructe.add("cirese");
        for(int index=0;index<fructe.size();index++){
            System.out.println("Numele fructelor sunt: " + fructe.get(index));
        }
    }

    //Afisam niste obiective turistice alaturi de orasele din care se afla
    //map = key - value
    public void obiectiveTuristice(){
        Map<String,String> obiective = new HashMap<>();
        obiective.put("Paris","Turnul Eiffel");
        obiective.put("Constanta","Casino");
        obiective.put("Brasov", "Piata Sfatului");
        obiective.put("Roma", "Panteon");
        obiective.put("Barcelona", "Sagrada");
        obiective.put("Berlin", "Zidul Berlinului");
        for (String key : obiective.keySet()){
            System.out.println("Orasul curent este: " + key);
            System.out.println("Obiectul din oras este: " + obiective.get(key));
        }
    }
    //ordonate dupa inserare cu LinkedHashMap
    public void obiectiveTuristiceV2(){
        Map<String,String> obiective = new LinkedHashMap<>();
        obiective.put("Paris","Turnul Eiffel");
        obiective.put("Constanta","Casino");
        obiective.put("Brasov", "Piata Sfatului");
        obiective.put("Roma", "Panteon");
        obiective.put("Barcelona", "Sagrada");
        obiective.put("Berlin", "Zidul Berlinului");
        for (String key : obiective.keySet()){
            System.out.println("Orasul curent este: " + key);
            System.out.println("Obiectul din oras este: " + obiective.get(key));
        }
    }

    public void obiectiveTuristiceV3(){
        Map<String,List<String>> obiective = new LinkedHashMap<>();
        obiective.put("Paris", Arrays.asList("Turnul Eiffel", "Arcul de triumf", "Luvru"));
        obiective.put("Constanta", Arrays.asList("Casino"));
        obiective.put("Brasov", Arrays.asList("Piata Sfatului", "Biserica Neagra"));
        obiective.put("Roma", Arrays.asList("Panteon"));
        obiective.put("Barcelona", Arrays.asList("Sagrada"));
        obiective.put("Berlin", Arrays.asList("Zidul Berlinului"));
        for (String key : obiective.keySet()){
            System.out.println("Orasul curent este: " + key);
            System.out.println("Obiectivele din oras este: " + obiective.get(key));
        }
    }

    public void obiectiveTuristiceV4(){
        Map<String, Map<String, List<String>>> obiectiveTari = new LinkedHashMap<>();

        Map<String,List<String>> oraseObiectiveFranta = new LinkedHashMap<>();
        oraseObiectiveFranta.put("Paris", Arrays.asList("Turnul Eiffel", "Arcul de triumf", "Luvru"));
        oraseObiectiveFranta.put("Lyon", Arrays.asList("Casino"));
        oraseObiectiveFranta.put("Nice", Arrays.asList("Piata Sfatului", "Biserica Neagra"));

        Map<String,List<String>> oraseObiectiveItalia = new LinkedHashMap<>();
        oraseObiectiveFranta.put("Roma", Arrays.asList("Colloseum", "Vatican"));
        oraseObiectiveFranta.put("Milano", Arrays.asList("Monza"));
        oraseObiectiveFranta.put("Bologna", Arrays.asList("Emilia Romana"));

        Map<String,List<String>> oraseObiectiveSpania = new LinkedHashMap<>();
        oraseObiectiveFranta.put("Madrid", Arrays.asList("Bernabeu"));
        oraseObiectiveFranta.put("Barcelona", Arrays.asList("Sagrada"));
        oraseObiectiveFranta.put("Valencia", Arrays.asList("no lo se"));

        obiectiveTari.put("Franta", oraseObiectiveFranta);
        obiectiveTari.put("Italia", oraseObiectiveItalia);
        obiectiveTari.put("Spania", oraseObiectiveSpania);

        for (String key : obiectiveTari.keySet())
        {
            System.out.println("Tara curenta este: " + key);

        }

    }

    //definim o carte de retete cu mai multe retete ce se diferentiaza pe numele lor
    //fiecare reteta are ingrediente
    //supa pui -> ingrediente (key - value)
    // si intr-un alt map care sa ii zica carte de retete.

}
