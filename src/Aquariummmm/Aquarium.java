package Aquariummmm;

import java.util.ArrayList;

public class Aquarium {
    ArrayList<Beings> beings;
    int nbjour;

    public Aquarium(ArrayList<Beings> beings) {
        this.beings = beings;
        this.nbjour=1;
    }

    public void setNbjour(int nbjour) {
        this.nbjour = nbjour;
    }

    public int getNbjour() {
        return nbjour;
    }

    public ArrayList<Beings> getBeings() {
        return beings;
    }
    public void AddBeing(Beings being){
        this.getBeings().add(being);
    }
    public void RemoveCorpse(Beings being){
        this.getBeings().remove(being);
    }
    public void PasserJour(){
        System.out.println(this.DisplayDay());
        System.out.println(this.Nbetoile());
        this.manger();
        this.DisplayBeings();
    }
    public String DisplayDay(){
        String day="";
        if(this.getNbjour()<1000){
            if (this.getNbjour()<10){
                day="Aquarium - Jour 00"+this.getNbjour();
            }
            if (this.getNbjour()<100 && this.getNbjour()>=10){
                day= "Aquarium - Jour 0"+this.getNbjour();
            }
            if(this.getNbjour()<1000 && this.getNbjour()>=100) {
                day= "Aquarium - Jour 0" + this.getNbjour();
            }
        }else day= "Aquarium - Jour "+this.getNbjour();
    return day;
    }
    public String Nbetoile(){
        String etoile="";
        for (int i = 0; i < this.DisplayDay().length(); i++) {
            etoile+="*";
        }
        return etoile;
    }
    public void manger(){
        for (int i = 0; i < this.FishList().size() ; i++) {
            if(this.FishList().get(i).isHungry()){
                if(this.FishList().get(i).getRegime()==Regime.CARNIVORE){
                    this.FishList().get(i).Mange(this.getRandomFish(this.FishList().get(i)));
                }else{
                    this.FishList().get(i).Mange(this.getRandomAlgue());
                }

            }
        }
    }
    public ArrayList<Poissons>FishList(){
        ArrayList<Poissons> fishs=new ArrayList<>();
        for (int i = 0; i < this.getBeings().size() ; i++) {
            if(this.getBeings().get(i)instanceof Poissons){
                fishs.add((Poissons) this.getBeings().get(i));
            }
        }
        return fishs;
    }
    public Poissons getRandomFish(Poissons f){
        int random = (int) (Math.random() * this.getBeings().size());
        while (this.getBeings().get(random)instanceof Poissons && !(this.getBeings().get(random).equals(f))){
            random = (int) (Math.random() * this.getBeings().size());
        }
        return (Poissons) this.getBeings().get(random);

    }
    public Algues getRandomAlgue(){
        int random = (int) (Math.random() * this.getBeings().size());
        while (this.getBeings().get(random)instanceof Algues ){
            random = (int) (Math.random() * this.getBeings().size());
        }
        return (Algues) this.getBeings().get(random);

    }
    public void DisplayBeings(){
        int nbAlgue=0;
        int nbFish = 0;
        System.out.println("Liste des être vivant: ");
        for (int i = 0; i < this.getBeings().size(); i++) {
            if(this.getBeings().get(i).isAlgue()){
                nbAlgue++;
                System.out.println("-Algue \t"+this.getBeings().get(i).getPv());
            }
            if(this.getBeings().get(i).isPoisson()){
                nbFish++;
                if(this.getBeings().get(i).isSole()){
                    System.out.println("-Sole "+((Poissons)this.getBeings().get(i)).getNom()+"\t"+this.getBeings().get(i).getPv());

                }
                if(this.getBeings().get(i).isBar()){
                    System.out.println("-Bar "+((Poissons)this.getBeings().get(i)).getNom()+ "\t"+this.getBeings().get(i).getPv());
                }
                if(this.getBeings().get(i).isCarpe()){
                    System.out.println("-Carpe "+((Poissons)this.getBeings().get(i)).getNom()+ "\t"+this.getBeings().get(i).getPv());
                }
                if(this.getBeings().get(i).isMerou()){
                    System.out.println("-Merou "+((Poissons)this.getBeings().get(i)).getNom()+" \t"+this.getBeings().get(i).getPv());
                }
                if(this.getBeings().get(i).isClownfish()){
                    System.out.println("-Clowfish "+((Poissons)this.getBeings().get(i)).getNom()+" \t"+this.getBeings().get(i).getPv());
                }
                if(this.getBeings().get(i).isThon()){
                    System.out.println("-Thon "+((Poissons)this.getBeings().get(i)).getNom()+" \t"+this.getBeings().get(i).getPv());
                }
            }
        }
        System.out.println("-Algues: "+nbAlgue );
        System.out.println("-Poissons: "+nbFish);
    }
}
