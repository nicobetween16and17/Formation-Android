package objects;


import java.util.Scanner;

public class Personnage {
    String nom;
    String prénom;
    int force;
    int pv;
    int lv;

    public Personnage(String nom, String prénom) {
        this.nom = nom;
        this.prénom = prénom;
        this.force = 10;
        this.pv = 20;
        this.lv =1;

    }
    public Personnage(int lv){
        this.nom = "ennemi de niveau "+lv;
        this.prénom = "Albatard";
        this.force=5+(lv*2);
        this.pv=(5*lv)+10;
        this.lv=lv;
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public int getForce() {
        return force;
    }

    public int getPv() {
        return pv;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }
    public void sePresente(){
        System.out.println("Bonjour, ahah, je m'apelle "+this.getNom() +" "+this.getPrénom());
    }
    public void voyage(Destionation d){
        int choix;
        for (int i = 0; i < (d.distance)/10; i++) {
            System.out.print(" ");
            if (Encounter()){
                System.out.println("Quelqu'un approche !");
                System.out.println("Choix: 1-parler 2-combattre 3-fuir 4-ignorer");
                choix = repondre();
                switch (choix){
                    case 1:
                        this.sePresente();
                        if (Encounter()){
                            System.out.println("lui: Bonjour mon ami, bonne journée n'est ce pas ?");
                        }else{
                            System.out.println("lui: Donne moi ton fric !");
                            new Personnage(this.lv).attack(this);
                        }
                            break;
                    case 2:
                        System.out.println("Vous démarrez l'attaque");
                        this.attack(new Personnage(this.lv));
                        break;
                    case 3:
                        if (Encounter()){
                        System.out.println("lui: Ou est ce que tu crois t'enfuir ?");
                        new Personnage(this.lv).attack(this);
                    }else{
                        System.out.println("lui: Mais qu'est ce qu'il a a fuir ce con ? je pue tant que ca ?");

                    }
                    break;
                    case 4:
                        if (Encounter()){
                        System.out.println("lui: Tu te prend pour qui ? Regarde moi dans les yeux !");
                        new Personnage(this.lv).attack(this);
                    }else{
                        System.out.println("Le passant vous devisage car vous n'êtes pas poli");

                    }
                        break;
                    default:
                        System.out.println("Tu dis n'importe quoi enfoiré ! A l'attaque !");
                        new Personnage(this.lv).attack(this);
                        break;

                }
            }else System.out.print("Vous ne rencontrez personne");
            System.out.println("Plus que "+(d.getDistance()-(i+1)*10)+" km");
            if(this.Encounter()){
                System.out.print("Il y a un abri, voulez vous vous reposer ? 1) oui 2 non");
                int rest=repondre();
                if (rest==1){
                    this.rest();
                }
            }

        }
        System.out.print("Vous êtes arrivé !");
    }
    public boolean isAlive(){
        if (this.getPv()<=0){
            return false;
        }else return true;
    }
    public void rest(){
        if (pv<10){
            this.setPv(getPv()+10);
        }else{
            pv=20;
        }

    }
    public void attack(Personnage ennemi){
        System.out.println(this.getNom()+" attaque "+ ennemi.getNom());
        System.out.println(ennemi.getNom()+" recois "+this.getForce()+" dommages");
        ennemi.setPv(ennemi.getPv()-this.getForce());
        System.out.println("pv de l'attaquant: "+this.getPv()+" pv de l'attaqué: "+ ennemi.getPv());
        if (ennemi.isAlive()){
            ennemi.attack(this);
        }else{
            System.out.println(ennemi.getNom()+" a été éliminé");
        }
    }
    public boolean Encounter(){
        int random = (int)Math.random()*2;
        if (random==0){
            return true;
        }else return false;
    }
    public int repondre(){
        Scanner s = new Scanner(System.in);
        return Integer.parseInt(s.nextLine());

    }
}
