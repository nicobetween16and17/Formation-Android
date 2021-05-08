package Aquariummmm.Fishs.Herbivore;

import Aquariummmm.Poissons;
import Aquariummmm.Regime;
import Aquariummmm.Sexe;

public class Carpe extends Poissons {
    public Carpe(int pv, Sexe sexe, String nom) {
        super(pv, sexe, nom);
        super.setRegime(Regime.HERBIVORE);
    }
}
