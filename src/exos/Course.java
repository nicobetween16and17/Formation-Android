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
    public Duree getTime(int km, int vitMoyenne){
        double temps = (double)(km/vitMoyenne)*3600;
        return new Duree((int)temps);
    }
    public void tour(){
        for (int i = 0; i < getVoitures().size() ; i++) {
            getVoitures().get(i).setTemps(getTime(getVoitures().get(i).vitesseMoyenne(getVoitures().get(i).getVitMax(),getVoitures().get(i).getVitMin()),this.circuit.distance));
            getVoitures().get(i).FiniUntour();
        }
    }
    public Voiture laPlusRapide(){
        int pin=0;
        for (int i = 0; i < this.voitures.size(); i++) {
            if (i==0){
                pin = i;
            }else{
                if(this.voitures.get(i).getTemps().SubDurée(this.voitures.get(pin).getTemps()).totalSecondes()>0){
                    pin=i;
                }
            }
        }
        return this.voitures.get(pin);
    }
}
