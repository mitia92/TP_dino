package hum;

public class Visiteur extends Humain
{
    public int numero;

    //construteur
    public Visiteur(String nom, int numero){
        super(nom);
        this.numero = numero;
    }
}
