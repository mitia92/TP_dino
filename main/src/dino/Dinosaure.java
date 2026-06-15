package dino;

import espaces.Enclos;

public abstract class Dinosaure {
    private int force;
    private Enclos<? extends Dinosaure> enclos = null;

    public Dinosaure() {

    }
    //Constructeur
    public Dinosaure(int force){
        this.force = force;
    }

    //méthodes
    public abstract void manger();

    //getter

    //comme force est privé, on le récupère avec un getter
    public int getForce() {
        return force;
    }

    //setter
    public void setForce(int force){
        this.force = force;
    }

    public Enclos<? extends Dinosaure> getEnclos(){
        return enclos;
    }

    public void setEnclos(Enclos<? extends Dinosaure> enclos) {
        this.enclos = enclos;
    }
}
