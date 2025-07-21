package temaOOP;

import java.util.List;

public class Patiserie {

    public List<Croissant> croissants;
    public List<Placinta> placinte;
    public List<Saratele> saratele;
    public List<Strudel> strudele;

    public Patiserie(List<Croissant> croissants, List<Placinta> placinte, List<Saratele> saratele, List<Strudel> strudele) {
        this.croissants = croissants;
        this.placinte = placinte;
        this.saratele = saratele;
        this.strudele = strudele;
    }

    public void prezentarePatiserie(){

        for(int index=0; index<croissants.size();index++){
            croissants.get(index).prezentareCroissant();
        }

        for(int index=0; index<placinte.size();index++){
            placinte.get(index).prezentarePlacinta();
        }

        for(int index=0; index<saratele.size();index++){
            saratele.get(index).prezentareSaratele();
        }

        for(int index=0; index<strudele.size();index++){
            strudele.get(index).prezentareStrudel();
        }
    }
}
