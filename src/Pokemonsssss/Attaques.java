package Pokemonsssss;

public class Attaques {
    Types type;
    int Puissance;
    boolean Physique;
    boolean boost;


    public Attaques(Types type, int puissance, boolean physique, boolean boost) {
        this.type = type;
        Puissance = puissance;
        Physique = physique;
        this.boost = boost;
    }

    public Types getType() {
        return type;
    }

    public int getPuissance() {
        return Puissance;
    }

    public boolean isPhysique() {
        return Physique;
    }

    public boolean isBoost() {
        return boost;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public void setPuissance(int puissance) {
        Puissance = puissance;
    }

    public void setPhysique(boolean physique) {
        Physique = physique;
    }

    public void setBoost(boolean boost) {
        this.boost = boost;
    }
}
