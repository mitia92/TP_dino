package dino;

public class Carnivore extends Dinosaure {
    int force;
    public Carnivore(int force){
        super(force);
    }

    @Override
    public void manger() {
        System.out.println("");
    }

    //méthodes
    public Herbivore chercher(){
        return new Herbivore(force);
    }
}
