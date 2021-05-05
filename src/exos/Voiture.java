package exos;

public class Voiture {
    private final int vitMax;
    private final int vitMin;
    public int nbTour;
    public String Model;
    public Duree temps;
    public int vitMoyenne;

    public int getVitMoyenne() {
        return vitMoyenne;
    }

    public void setVitMoyenne() {
        this.vitMoyenne = vitesseMoyenne(this.getVitMax(),this.getVitMin());
    }


    public Duree getTemps() {
        return temps;
    }

    public void setTemps(Duree temps) {
        this.temps=this.temps.AddDuree(temps);
    }

    public Voiture(int vitMax, int vitMin, String model) {
        this.vitMax = vitMax;
        this.vitMin = vitMin;
        this.Model = model;
        this.temps=new Duree(0);
        this.nbTour=0;

        this.nbTour=0;
    }

    public int getVitMax() {
        return vitMax;
    }

    public int getVitMin() {
        return vitMin;
    }


    public String getModel() {
        return Model;
    }

    public void FiniUntour(){
        this.nbTour++;
    }
    public int vitesseMoyenne(int vitMax, int vitMin){
        return (int)(Math.random()*(vitMax-vitMin)+vitMin);
    }
}
