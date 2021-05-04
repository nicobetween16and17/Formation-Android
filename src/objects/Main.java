package objects;

import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Destionation> destionations= new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Quel est votre nom ? ");
        String nom= s.nextLine();
        System.out.println();
        System.out.print("Quel est votre prénom ? ");
        String prenom = s.nextLine();
        Personnage p = new Personnage(nom, prenom);
        System.out.println("Bienvenu "+p.getPrénom()+" "+p.getNom()+" !");
        System.out.println("Destination: ");
        Destionation d = new Destionation();
        d.generateListe();
        for (int i = 0; i < 4; i++) {
            System.out.print((i+1)+"- ");
            destionations.add( d.generateDestination());
            destionations.get(i).display();
            System.out.println();
        }
        while (p.isAlive()){
            System.out.print("Choississez une destination: ");
            int choix = Integer.parseInt(s.nextLine());
            p.voyage(destionations.get(choix-1));
        }


    }
}
