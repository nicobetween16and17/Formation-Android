package Aquariummmm.Fishs.Herbivore;

import Aquariummmm.Poissons;
import Aquariummmm.Regime;
import Aquariummmm.Sexe;

public class Sole extends Poissons {
    public Sole(int pv, Sexe sexe, String nom) {
        super(pv, sexe, nom);
        super.setRegime(Regime.HERBIVORE);
    }
}
