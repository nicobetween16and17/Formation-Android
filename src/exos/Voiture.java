package exos;

public class Voiture {
    private int vitMax;
    private int vitMin;
    public int nbTour;
    public String Model;
    public String Marque;

    public Voiture(int vitMax, int vitMin) {
        this.vitMax = vitMax;
        this.vitMin = vitMin;
        this.nbTour = 0;
    }

    public Voiture(int vitMax, int vitMin, String model, String marque) {
        this.vitMax = vitMax;
        this.vitMin = vitMin;
        Model = model;
        Marque = marque;
        this.nbTour=0;
    }

    public int getVitMax() {
        return vitMax;
    }

    public int getVitMin() {
        return vitMin;
    }

    public int getNbTour() {
        return nbTour;
    }

    public void setVitMax(int vitMax) {
        this.vitMax = vitMax;
    }

    public void setVitMin(int vitMin) {
        this.vitMin = vitMin;
    }

    public void setNbTour(int nbTour) {
        this.nbTour = nbTour;
    }

    public String getModel() {
        return Model;
    }

    public String getMarque() {
        return Marque;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public void FiniUntour(){
        this.nbTour++;
    }

}
