package Aquariummmm.Fishs.Carnivores;

import Aquariummmm.Poissons;
import Aquariummmm.Regime;
import Aquariummmm.Sexe;

public class Merou extends Poissons {

    public Merou(int pv, String nom,int age) {
        super(pv, nom,age);
        super.setRegime(Regime.CARNIVORE);
    }
    public Sexe CurrentSexe(int age){
        if(!(age>10 && (age/10)%2==0)){
            return this.getSexe();
        }else{
            return this.getSexe()==Sexe.FEMELLE?Sexe.MALE:Sexe.FEMELLE;
        }
    }
}
