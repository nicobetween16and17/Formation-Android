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
    boolean isfuckable;
    boolean hasfucked;

    public Poissons(int pv, String nom, int age) {
        super(pv,age);
        this.sexe=randomSexe();
        this.nom=nom;
        isfuckable=false;
        boolean hasfucked;
    }

    public boolean isHasfucked() {
        return hasfucked;
    }

    public void setHasfucked(boolean hasfucked) {
        this.hasfucked = hasfucked;
    }

    public boolean isIsfuckable() {
        return !this.isHungry()&&this.getAge()>2;
    }

    public Sexe randomSexe(){

        int random=(int)(Math.random()*2+1);
        return random ==1?Sexe.FEMELLE:Sexe.MALE;
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
        if(b.isAlgue()){
            b.setPv(b.getPv()-2);
            this.setPv(this.getPv()+2);
            System.out.println(this.getNom()+" mange une Algue" );
        }
        if (b.isPoisson()){
            b.setPv(b.getPv()-4);
            this.setPv(this.getPv()+5);
            System.out.println(this.getNom()+" attaque "+((Poissons) b).getNom());
        }
    }


}
