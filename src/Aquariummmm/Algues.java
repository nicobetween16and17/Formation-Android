package Aquariummmm;

public class Algues extends Beings{

    public Algues(int pv) {
        super(pv);
    }
    public void grandir(){
        this.setPv(getPv()+1);
    }
}
