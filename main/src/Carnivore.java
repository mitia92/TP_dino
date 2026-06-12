public class Carnivore extends Dinosaure{
    public Carnivore(int force){
        super(force);
    }

    public String manger() {
        return null;
    }

    public Herbivore chercher(){
        Herbivore h = new Herbivore();
        return h;
    }
}
