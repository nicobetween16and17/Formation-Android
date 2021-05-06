package Pokemonsssss;

import java.util.ArrayList;

public class Dresseur {
    ArrayList<Pokemon> equipe;
    String nom;
    int argent;

    public Dresseur(ArrayList<Pokemon> equipe, String nom, int argent) {
        this.equipe = equipe;
        this.nom = nom;
        this.argent = argent;
    }

    public ArrayList<Pokemon> getEquipe() {
        return equipe;
    }

    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }
}
