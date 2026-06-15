package espaces;

import dino.Dinosaure;

import java.util.HashSet;
import java.util.Set;

public class Enclos<T extends Dinosaure>{
    private int robustesse;
    //Dans la définition d'enclos, on définit le type d'objet qui sera présent dans espaces.Enclos, ici T = dino.Dinosaure
    //la généricité intervient dans le fait que T peut être spécifié comme étant théoropode ou ornithiscien, sans que
    //cela ne change l'implémentation de espaces.Enclos

    protected T Dinosaure ;


    //On met les dinosaures de l'enclos dans un hashset afin que la taille du set change automatiquement lors
    //de la suppression ou de l'ajout d'un dinosaure
    HashSet<T> dinos = new HashSet<T>();

    //constructeurs

    public Enclos(){}

    public Enclos(int r, T d){
        this.Dinosaure = d;
        this.robustesse = r;
    }

    //méthodes
    public void nourrirTous(){
        //on fait une copie de la collection dinos
        Set<T> mesDinos = new HashSet<>(dinos);
        for(T dino : mesDinos){
            dino.manger();
        }
    }

    public HashSet<T> getDino(){
        return dinos;
    }


    public int getRobustesse() {
        return robustesse;
    }

    public void addDino(T dino){
        dinos.add(dino);
        dino.setEnclos(this);
    }
}