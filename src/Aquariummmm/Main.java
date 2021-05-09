package Aquariummmm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Aquarium a = new Aquarium(new ArrayList<Beings>());
        a.initialize();
        String choix="";
        boolean finish = false;
        a.DisplayBeings();
        while (!finish){
            System.out.println("Choix: pass-passer un tour, save-sauvegarder, quit-quitter");
            choix =s.nextLine();
            switch (choix){
                case "pass": a.PasserJour();break;
                case "save": a.saveFile();break;
                case "quit": finish=true;break;
                default:;break;
            }
        }

    }
}
