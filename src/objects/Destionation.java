package objects;

import java.util.ArrayList;

public class Destionation {
    String nom;
    int distance;
    ArrayList<String> Destinations;

    public Destionation(String nom, int distance) {
        this.nom = nom;
        this.distance = distance;

    }

    public Destionation() {
        this.Destinations = new ArrayList<>();
    }
    public void display(){
        System.out.print(this.getNom()+" "+this.getDistance()+"km ");
    }

    public String getNom() {
        return nom;
    }

    public int getDistance() {
        return distance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void generateListe() {
        this.Destinations.add("Village");
        this.Destinations.add("Grotte");
        this.Destinations.add("Donjon");
        this.Destinations.add("Ville");
        this.Destinations.add("Ferme");
        this.Destinations.add("Skatepark");

    }

    public Destionation generateDestination() {

        int randomnom = (int) Math.random() * this.Destinations.size();
        int randomdistance = (int) (Math.random() * 100) + 60;
        String nom = this.Destinations.get(randomnom);
        this.Destinations.remove(randomnom);
        return new Destionation(nom, randomdistance);

    }
}
