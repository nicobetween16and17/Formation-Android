package Aquariummmm;

public class Algues extends Beings{

    public Algues(int pv,int age) {
        super(pv,age);
    }
    public void grandir(){
        this.setPv(getPv()+1);
    }
}
