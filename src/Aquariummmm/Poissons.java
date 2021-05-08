package Aquariummmm;

import Aquariummmm.Fishs.Carnivores.Clownfish;
import Aquariummmm.Fishs.Carnivores.Merou;
import Aquariummmm.Fishs.Carnivores.Thon;
import Aquariummmm.Fishs.Herbivore.Bar;
import Aquariummmm.Fishs.Herbivore.Carpe;
import Aquariummmm.Fishs.Herbivore.Sole;

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

    public Regime getRegime() {
        return regime;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public boolean isHungry(){
        return this.getPv()<=5;
    }
    public void Mange(Beings b){
        if(b instanceof Algues){
            b.setPv(b.getPv()-2);
            this.setPv(this.getPv()+2);
            System.out.println(this.getNom()+" mange une Algue" );
        }
        if (b instanceof Poissons){
            b.setPv(b.getPv()-4);
            this.setPv(this.getPv()+5);
            System.out.println(this.getNom()+" attaque "+((Poissons) b).getNom());
        }
    }


}
