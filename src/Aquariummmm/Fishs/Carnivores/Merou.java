package Aquariummmm.Fishs.Carnivores;

import Aquariummmm.Poissons;
import Aquariummmm.Regime;
import Aquariummmm.Sexe;

public class Merou extends Poissons {

    public Merou(int pv, String nom,int age) {
        super(pv, nom,age);
        super.setRegime(Regime.CARNIVORE);
    }
}
