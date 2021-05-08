package Aquariummmm.Fishs.Carnivores;

import Aquariummmm.Poissons;
import Aquariummmm.Regime;
import Aquariummmm.Sexe;

public class Clownfish extends Poissons {

    public Clownfish(int pv, String nom, int age) {
        super(pv, nom, age);
        super.setRegime(Regime.CARNIVORE);
    }
}
