package hum;

public class Employe extends Humain {
    public String fonction;

    //constructeur
    public Employe(String nom, String fonction){
        super(nom); //super appelle le constructeur de humain, on passe l'attribut nom en paramètre
        this.fonction = fonction;
    }
}
