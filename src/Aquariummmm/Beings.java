package Aquariummmm;

import Aquariummmm.Fishs.Carnivores.Clownfish;
import Aquariummmm.Fishs.Carnivores.Merou;
import Aquariummmm.Fishs.Carnivores.Thon;
import Aquariummmm.Fishs.Herbivore.Bar;
import Aquariummmm.Fishs.Herbivore.Carpe;
import Aquariummmm.Fishs.Herbivore.Sole;

public class Beings {
    int pv;
    boolean Alive;
    int age;

    public Beings(int pv, int age) {
        this.pv = pv;
        this.Alive = this.pv > 0;
        this.age=age;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return this.getPv()>0 && this.getAge()<=20;
    }

    public void setAlive(boolean alive) {
        this.Alive = alive;
    }
    public boolean isPoisson(){
        return this instanceof Poissons;
    }
    public boolean isAlgue(){
        return this instanceof Algues;
    }
    public boolean isMerou(){
        return this instanceof Merou;
    }
    public boolean isBar(){
        return this instanceof Bar;
    }
    public boolean isThon(){
        return this instanceof Thon;
    }
    public boolean isClownfish(){
        return this instanceof Clownfish;
    }
    public boolean isCarpe(){
        return this instanceof Carpe;
    }
    public boolean isSole(){
        return this instanceof Sole;
    }

}
