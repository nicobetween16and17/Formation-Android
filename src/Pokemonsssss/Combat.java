package Pokemonsssss;

public class Combat {
    Dresseur you;
    Dresseur him;

    public Combat(Dresseur you, Dresseur him) {
        this.you = you;
        this.him = him;
    }

    public Dresseur getYou() {
        return you;
    }

    public Dresseur getHim() {
        return him;
    }
}
