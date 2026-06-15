package espaces;

import dino.Dinosaure;

import java.util.HashSet;

public class Zoo {
    HashSet<Enclos<? extends Dinosaure>> enclos = new HashSet<>(); //? pour ne pas avoir à spécifier quel type de dinosaures contiendra l'enclos

    //constructeur
    public Zoo(){}

    //méthodes
    public void ajouterEnclos(Enclos<? extends Dinosaure> e){
        this.enclos.add(e);

    }
}
