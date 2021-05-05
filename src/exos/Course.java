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
        double temps = ((double)km/(double)vitMoyenne)*3600;
        return new Duree((int)temps);
    }
    public void tour(){
        for (int i = 0; i < getVoitures().size() ; i++) {
            this.getVoitures().get(i).setVitMoyenne();
            this.getVoitures().get(i).setTemps(getTime(this.getCircuit().getDistance(),getVoitures().get(i).getVitMoyenne()));
            this.getVoitures().get(i).FiniUntour();
        }
    }
    public Voiture laPlusRapide(){
        int pin=0;
        for (int i = 0; i < this.voitures.size(); i++) {
            if (i==0){
                pin = i;
            }else{
                if(this.getVoitures().get(i).getTemps().SubDurée(this.getVoitures().get(pin).getTemps()).totalSecondes()<0){
                    pin=i;
                }
            }
        }
        return this.getVoitures().get(pin);
    }
}
