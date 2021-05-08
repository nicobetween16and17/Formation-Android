package Aquariummmm.Fishs.Herbivore;

import Aquariummmm.Poissons;
import Aquariummmm.Regime;
import Aquariummmm.Sexe;

public class Bar extends Poissons {
    public Bar(int pv, Sexe sexe, String nom) {
        super(pv, sexe, nom);
        super.setRegime(Regime.HERBIVORE);
    }
}
