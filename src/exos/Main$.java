package exos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main$ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Voiture> voitures = new ArrayList<>();
        System.out.print("Nombre de tour: ");
        int nbtour=Integer.parseInt(s.nextLine());;
        System.out.print("Distance du circuit");
        int distance=Integer.parseInt(s.nextLine());;

        Circuit c = new Circuit(nbtour,distance);
        Course course = new Course(voitures,c);
        System.out.print("Cb de participants ? ");
        int participants = Integer.parseInt(s.nextLine());
        for (int i = 0; i < participants; i++) {
            int vitmax = generaterandom();
            int vitmin = generaterandom();
            int lepluspetit;
            lepluspetit= Math.min(vitmax, vitmin);
            vitmax= Math.max(vitmax, vitmin);
            vitmin=lepluspetit;
            voitures.add(new Voiture(vitmax,vitmin));
        }




    }
    public static int generaterandom(){
        return (int)(Math.random()*60)+120;
    }

}
