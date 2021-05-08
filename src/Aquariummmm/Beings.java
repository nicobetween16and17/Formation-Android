package Aquariummmm;

public class Beings {
    int pv;
    boolean Alive;

    public Beings(int pv) {
        this.pv = pv;
        this.Alive = this.pv > 0;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public boolean isAlive() {
        return this.Alive;
    }

    public void setAlive(boolean alive) {
        this.Alive = alive;
    }
}
