package Pokemonsssss;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> Pokemon = new ArrayList<>();
        ArrayList<Attaques> attaques = new ArrayList<>();
        attaques.add(new Attaques(Types.ELECTRIQUE,90,false,false));
        attaques.add(new Attaques(Types.NORMAL,35,true,false));
        attaques.add(new Attaques(Types.ELECTRIQUE,120,true,false));
        attaques.add(new Attaques(Types.VOL,70,true,false));
        Pokemon.add(new Pokemon(35,55,40,90,50,50,"Pikachu",attaques,Types.ELECTRIQUE,5));
        Dresseur you = new Dresseur(Pokemon,"Sasha",5);
        Dresseur him = new Dresseur(Pokemon,"Regis",2000000);
        Combat a = new Combat(you, him);


    }
}
