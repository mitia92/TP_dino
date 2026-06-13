package mains;
//création d'un enclos

import dino.Herbivore;
import espaces.Enclos;

public class test_enclos {

    public static void main(String[] args){
        Enclos<Herbivore> e = new Enclos<Herbivore>(1, new Herbivore(10), 10);
    }
}
