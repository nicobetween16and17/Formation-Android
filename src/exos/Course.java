package exos;

import java.util.ArrayList;

public class Course {
    ArrayList<Voiture> voitures;
    Circuit circuit;

    public Course(ArrayList<Voiture> voitures, Circuit circuit) {
        this.voitures = voitures;
        this.circuit = circuit;
    }

    public ArrayList<Voiture> getVoitures() {
        return voitures;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public void setVoitures(ArrayList<Voiture> voitures) {
        this.voitures = voitures;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }
}
