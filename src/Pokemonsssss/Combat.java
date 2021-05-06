package Pokemonsssss;

public class Combat {
    private Dresseur you;
    private Dresseur him;

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
    public int getDegatToHim(Attaques attaque){
        Types typeDuPokemonAdverse=Types.NORMAL;
        int degats=0;
        for (int i = 0; i < getHim().getEquipe().size(); i++) {
            if(getHim().getEquipe().get(i).isInFight()){
                typeDuPokemonAdverse=getHim().getEquipe().get(i).getType();
            }
        }
        for (int i = 0; i < getYou().getEquipe().size(); i++) {
            if (getYou().getEquipe().get(i).isInFight()){
                if (attaque.getType().isWeakAgainst(typeDuPokemonAdverse)){
                    if(attaque.isPhysique())
                        degats = (getYou().getEquipe().get(i).getAttaque() * attaque.getPuissance()) / 2;
                    else degats= (getYou().getEquipe().get(i).getAttaqueSpecial()*attaque.getPuissance())/2;

                }
                if (typeDuPokemonAdverse.isWeakAgainst(attaque.getType())){
                    if(attaque.isPhysique()){
                        degats= (getYou().getEquipe().get(i).getAttaque()*attaque.getPuissance())*2;
                    }else degats= (getYou().getEquipe().get(i).getAttaqueSpecial()*attaque.getPuissance())*2;

                }
                if(typeDuPokemonAdverse.isWeakAgainst(attaque.getType()) && attaque.getType().isWeakAgainst(typeDuPokemonAdverse)){
                    if(attaque.isPhysique()){
                        degats= (getYou().getEquipe().get(i).getAttaque()*attaque.getPuissance());
                    }else degats= (getYou().getEquipe().get(i).getAttaqueSpecial()*attaque.getPuissance());
                }
            }
        }

        return degats;
    }
    public int getDegatToYou(Attaques attaque){
        Types typeDuPokemonAdverse=Types.NORMAL;
        int degats=0;
        for (int i = 0; i < getYou().getEquipe().size(); i++) {
            if(getYou().getEquipe().get(i).isInFight()){
                typeDuPokemonAdverse=getYou().getEquipe().get(i).getType();
            }
        }
        for (int i = 0; i < getHim().getEquipe().size(); i++) {
            if (getHim().getEquipe().get(i).isInFight()){
                if (attaque.getType().isWeakAgainst(typeDuPokemonAdverse)){
                    if(attaque.isPhysique())
                        degats = (getHim().getEquipe().get(i).getAttaque() * attaque.getPuissance()) / 2;
                    else degats= (getHim().getEquipe().get(i).getAttaqueSpecial()*attaque.getPuissance())/2;

                }
                if (typeDuPokemonAdverse.isWeakAgainst(attaque.getType())){
                    if(attaque.isPhysique()){
                        degats= (getHim().getEquipe().get(i).getAttaque()*attaque.getPuissance())*2;
                    }else degats= (getHim().getEquipe().get(i).getAttaqueSpecial()*attaque.getPuissance())*2;

                }
                if(typeDuPokemonAdverse.isWeakAgainst(attaque.getType()) && attaque.getType().isWeakAgainst(typeDuPokemonAdverse)){
                    if(attaque.isPhysique()){
                        degats= (getHim().getEquipe().get(i).getAttaque()*attaque.getPuissance());
                    }else degats= (getHim().getEquipe().get(i).getAttaqueSpecial()*attaque.getPuissance());
                }
            }
        }

        return degats;
    }
}
