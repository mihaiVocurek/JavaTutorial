package teme;

import org.testng.annotations.Test;

import java.util.*;


public class TemaCarteRetete {

    @Test
    public void testMethod(){
        creareCarteRetete();
    }

    public void creareCarteRetete(){
        Map<String, List<String>> carteRetete = new LinkedHashMap<>();
        carteRetete.put("omleta", Arrays.asList("Oua", "Ceapa", "Ardei", "Branza sarata", "Sare", "Piper","Ulei"));
        carteRetete.put("supa de rosii", Arrays.asList("Rosii", "Taitei", "Ceapa", "Ardei", "Apa", "Sare", "Busuioc"));
        carteRetete.put("sarmale", Arrays.asList("Carne tocata porc", "Orez", "Suc rosii", "Varza murata", "Sare", "Piper"));
        carteRetete.put("papanasi", Arrays.asList("Faina", "Branza dulce", "Zahar", "Drojdie", "Dulceata", "Smantana"));
        carteRetete.put("salata orientala", Arrays.asList("Cartofi", "Oua", "Ceapa", "Masline", "Otet", "Ulei","Sare"));
        carteRetete.put("paste la cuptor", Arrays.asList("Paste", "Sos rosii", "Usturoi", "Busuioc", "Mozzarela", "Parmezan"));

        for (String key : carteRetete.keySet())
        {
            System.out.print("Reteta pentru " + key);
            System.out.println(" are ingredientele: " + carteRetete.get(key));
        }
    }


}
