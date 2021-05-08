package Aquariummmm.Fishs.Herbivore;

import Aquariummmm.Poissons;
import Aquariummmm.Regime;
import Aquariummmm.Sexe;

public class Carpe extends Poissons {
    public Carpe(int pv, String nom,int age) {
        super(pv, nom,age);
        super.setRegime(Regime.HERBIVORE);
    }
}
