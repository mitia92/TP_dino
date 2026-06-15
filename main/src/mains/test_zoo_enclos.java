package mains;

import dino.Carnivore;
import dino.Herbivore;
import espaces.Enclos;
import espaces.Zoo;

//Création d'un zoo et ajout d'enclos dans le hashset du zoo
public class test_zoo_enclos {
    public static void main(String[] args){
        Zoo z = new Zoo();
        Enclos<Carnivore> enclos1 = new Enclos<>();
        Enclos<Herbivore> enclos2 = new Enclos<>();

        //Ajouter les enclos au zoo
        z.ajouterEnclos(enclos1);
        z.ajouterEnclos(enclos2);

    }
}
