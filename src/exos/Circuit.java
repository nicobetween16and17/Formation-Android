package exos;

public class Circuit {
    int nbToutTot;
    int distance;

    public Circuit(int nbToutTot, int distance) {
        this.nbToutTot = nbToutTot;
        this.distance = distance;
    }

    public int getNbToutTot() {
        return nbToutTot;
    }

    public int getDistance() {
        return distance;
    }

    public void setNbToutTot(int nbToutTot) {
        this.nbToutTot = nbToutTot;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
