package Aquariummmm;

public class Poissons extends Beings{
    Sexe sexe;
    String nom;
    Regime regime;

    public Poissons(int pv,Sexe sexe, String nom) {
        super(pv);
        this.sexe=sexe;
        this.nom=nom;
    }


    public void setRegime(Regime regime) {
        this.regime = regime;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
