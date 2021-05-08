package Aquariummmm.Fishs.Carnivores;

import Aquariummmm.Poissons;
import Aquariummmm.Regime;
import Aquariummmm.Sexe;

public class Clownfish extends Poissons {

    public Clownfish(int pv, Sexe sexe, String nom) {
        super(pv, sexe, nom);
        super.setRegime(Regime.CARNIVORE);
    }
}
