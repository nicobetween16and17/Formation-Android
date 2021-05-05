package exos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main$ {
    public static void main(String[] args) {

        String[] marques = {"Trueno Panda", "Ford Fiesta", "Toyota Prius", "Tesla", "Formule 1",
                "Toyota Corolla", "Volkswagen golf", "Honda Civic",
                "Chevrolet Impala", "Mercedes Citroen", "Renault Clio",
                "Opel Astra", "Hyundai Elantra", "Ford Mustang", "Mazda 323", "Fiat Uno", "Peugeot 206"};
        ArrayList<Integer> marquesChoisies = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        ArrayList<Voiture> voitures = new ArrayList<>();
        System.out.print("Nombre de tour: ");
        int nbtour = Integer.parseInt(s.nextLine());
        System.out.print("Distance du circuit");
        int distance = Integer.parseInt(s.nextLine());

        Circuit c = new Circuit(nbtour, distance);
        Course course = new Course(voitures, c);
        System.out.print("Cb de participants ? ");
        int participants = Integer.parseInt(s.nextLine());
        for (int i = 0; i < participants; i++) {
            int vitmax = generaterandom();
            int vitmin = generaterandom();
            int lepluspetit;
            String model = generaterandom2(marques, marquesChoisies);
            lepluspetit = Math.min(vitmax, vitmin);
            vitmax = Math.max(vitmax, vitmin);
            vitmin = lepluspetit;
            voitures.add(new Voiture(vitmax, vitmin, model));
            System.out.println("Ajout de la voiture de modele " + model + " allant de " + vitmin + "km/h à " + vitmax + " km/h");
        }
        for (int i = 0; i < course.getCircuit().getNbToutTot(); i++) {
            System.out.println((i+1) + "e tour");
            course.tour();
            System.out.println("La " + course.laPlusRapide().getModel() +
                    " est en tête avec un temps de " + course.laPlusRapide().getTemps().CourseTemps() +
                     "s et une vitesse moyenne de " + course.laPlusRapide().getVitMoyenne() + " km/h");
        }


    }

    public static int random() {
        return (int) (Math.random() * 15);
    }

    public static int generaterandom() {
        return (int) (Math.random() * 60) + 120;
    }

    public static String generaterandom2(String[] tab, ArrayList<Integer> List) {
        boolean exist = false;
        int cpt = 0;
        int random = 0;
        if (!List.isEmpty()) {
            while (!exist) {
                random = random();
                for (int i = 0; i < List.size(); i++) {
                    if (List.get(i) == random) {
                        cpt = 1;
                    }
                }
                exist = cpt != 1;
                cpt = 0;
            }
        } else {
            random = random();
        }
        List.add(random);
        return tab[random];
    }

}
