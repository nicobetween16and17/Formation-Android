package Pokemonsssss;

import java.util.ArrayList;

public class Pokemon {
    int pv;
    int attaque;
    int defense;
    int vitesse;
    int attaqueSpecial;
    int defenseSpecial;
    String nom;
    ArrayList<Attaques> attaques;
    Types type;
    boolean stab;
    int lv;
    boolean inFight;

    public Pokemon(int pv, int attaque, int defense, int vitesse, int attaqueSpecial, int defenseSpecial, String nom, ArrayList<Attaques> attaques, Types type,int lv) {
        this.pv = pv;
        this.attaque = attaque;
        this.defense = defense;
        this.vitesse = vitesse;
        this.attaqueSpecial = attaqueSpecial;
        this.defenseSpecial = defenseSpecial;
        this.nom = nom;
        this.attaques = attaques;
        this.type=type;
        this.stab = false;
        this.lv=lv;
        this.inFight=false;
    }

    public int getPv() {
        return pv;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getDefense() {
        return defense;
    }

    public int getVitesse() {
        return vitesse;
    }

    public int getAttaqueSpecial() {
        return attaqueSpecial;
    }

    public int getDefenseSpecial() {
        return defenseSpecial;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Attaques> getAttaques() {
        return attaques;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void setAttaqueSpecial(int attaqueSpecial) {
        this.attaqueSpecial = attaqueSpecial;
    }

    public void setDefenseSpecial(int defenseSpecial) {
        this.defenseSpecial = defenseSpecial;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAttaques(ArrayList<Attaques> attaques) {
        this.attaques = attaques;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public boolean isStab() {
        return stab;
    }

    public void setStab(boolean stab) {
        this.stab = stab;
    }
    public int getTotalStat(int basesStat){
        return (2*basesStat*this.lv)/100;
    }

    public int getLv() {
        return lv;
    }

    public boolean isInFight() {
        return inFight;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public void setInFight(boolean inFight) {
        this.inFight = inFight;
    }
}
