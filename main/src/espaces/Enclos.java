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
    protected int n;

    //On met les dinosaures de l'enclos dans un hashset afin que la taille du set change automatiquement lors
    //de la suppression ou de l'ajout d'un dinosaure
    HashSet<T> dinos = new HashSet<T>();

    //constructeur
    public Enclos(int r, T d, int n){
        this.Dinosaure = d;
        this.robustesse = r;
        this.n = n;
    }

    //méthodes
    public void nourrirTous(){
        for(Dinosaure dino : dinos){
            dino.manger();
        }
    }

    public Set<T> getDinosaure(){
        return dinos;
    }


}
