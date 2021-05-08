package Aquariummmm;

import Aquariummmm.Fishs.Carnivores.Clownfish;
import Aquariummmm.Fishs.Carnivores.Merou;
import Aquariummmm.Fishs.Carnivores.Thon;
import Aquariummmm.Fishs.Herbivore.Bar;
import Aquariummmm.Fishs.Herbivore.Carpe;
import Aquariummmm.Fishs.Herbivore.Sole;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public void initialize(){

        Scanner s = new Scanner(System.in);
        String pattern = "[A-Z]+\\:+(\\\\+\\w{1,}){1,}.txt";
        Pattern p = Pattern.compile(pattern);
        String path = "";
        boolean match = false;
        while (!match){
            System.out.print("File path: ");
            path = s.nextLine();
            Matcher m=p.matcher(path);
            match = m.matches();

        }
        System.out.println();
        File file = new File(path);
        Scanner Files = null;
        try {
            Files = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        boolean end=false;
        while (Files.hasNextLine()){
            String[] splits = Files.nextLine().split(" ");
            try {
                if(splits[1].equals("algue")){
                    this.AddBeing(new Algues(10));
                }
                if(splits[1].equals("Merou")){
                    this.AddBeing(new Merou(10,splits[0],Integer.parseInt(splits[2])));
                }
                if(splits[1].equals("Thon")){
                    this.AddBeing(new Thon(10,splits[0],Integer.parseInt(splits[2])));
                }
                if(splits[1].equals("Sole")){
                    this.AddBeing(new Sole(10,splits[0],Integer.parseInt(splits[2])));
                }
                if(splits[1].equals("Clownfish")){
                    this.AddBeing(new Clownfish(10,splits[0],Integer.parseInt(splits[2])));
                }
                if(splits[1].equals("Bar")){
                    this.AddBeing(new Bar(10,splits[0],Integer.parseInt(splits[2])));
                }
                if(splits[1].equals("Carpe")){
                    this.AddBeing(new Carpe(10,splits[0],Integer.parseInt(splits[2])));
                }
            }catch(Exception e){

            }
        }


    }
    public void saveFile(){
        try {
            String race ="";
            FileWriter save = new FileWriter("Save");
            for (int i = 0; i < this.getBeings().size(); i++) {
                if(this.getBeings().get(i)instanceof Algues){
                    race="algue";
                    save.write(this.getBeings().get(i).getPv()+" "+race+" "+this.getBeings().get(i).getAge());
                }else{
                    if (this.getBeings().get(i)instanceof Thon){
                        race = "Thon";
                    }
                    if (this.getBeings().get(i)instanceof Merou){
                        race ="Merou";
                    }
                    if (this.getBeings().get(i)instanceof Clownfish){
                        race ="Clownfish";
                    }
                    if (this.getBeings().get(i)instanceof Bar){
                        race ="Bar";
                    }
                    if (this.getBeings().get(i)instanceof Sole){
                        race ="Sole";
                    }
                    if (this.getBeings().get(i)instanceof Carpe){
                        race = "Carpe";
                    }
                    save.write(((Poissons)this.getBeings().get(i)).getNom()+" "+race+" "+this.getBeings().get(i).getAge());

                }



            }

        } catch (IOException e) {
            e.printStackTrace();
        }


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
