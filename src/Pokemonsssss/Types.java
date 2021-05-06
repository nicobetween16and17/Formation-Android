package Pokemonsssss;

public enum Types {
    ACIER, COMBAT, FEU, EAU, PLANTE, DRAGON, ELECTRIQUE, FEE, TENEBRES, PSY, INSECTE, SOL, SPECTRE, GLACE, NORMAL, POISON, VOL, ROCHE;

    public boolean isWeakAgainst(Types type) {
        boolean isWeakAgainst;
        switch (this) {
            case EAU:
                isWeakAgainst = type.equals(PLANTE) || type.equals(DRAGON) || type.equals(EAU);
                break;
            case FEE:
                isWeakAgainst = type.equals(ACIER) || type.equals(FEU) || type.equals(POISON);
                break;
            case FEU:
                isWeakAgainst = type.equals(EAU) || type.equals(ROCHE) || type.equals(DRAGON) || type.equals(FEU);
                break;
            case PSY:
                isWeakAgainst = type.equals(ACIER) || type.equals(PSY) || type.equals(EAU);
                break;
            case SOL:
                isWeakAgainst = type.equals(PLANTE) || type.equals(INSECTE);
                break;
            case VOL:
                isWeakAgainst = type.equals(ROCHE) || type.equals(ACIER) || type.equals(ELECTRIQUE);
                break;
            case ACIER:
                isWeakAgainst = type.equals(FEU) || type.equals(ACIER) || type.equals(EAU);
                break;
            case GLACE:
                isWeakAgainst = type.equals(ACIER) || type.equals(EAU) || type.equals(FEU) || type.equals(GLACE);
                break;
            case ROCHE:
                isWeakAgainst = type.equals(ACIER) || type.equals(SOL) || type.equals(COMBAT);
                break;
            case COMBAT:
                isWeakAgainst = type.equals(PSY) || type.equals(VOL) || type.equals(POISON) || type.equals(INSECTE) || type.equals(FEE);
                break;
            case DRAGON:
                isWeakAgainst = type.equals(ACIER);
                break;
            case NORMAL:
                isWeakAgainst = type.equals(ACIER) || type.equals(ROCHE);
                break;
            case PLANTE:
                isWeakAgainst = type.equals(FEU) || type.equals(VOL) || type.equals(POISON) || type.equals(INSECTE) || type.equals(ACIER) || type.equals(PLANTE) || type.equals(DRAGON);
                break;
            case POISON:
                isWeakAgainst = type.equals(POISON) || type.equals(ROCHE) || type.equals(SOL) || type.equals(SPECTRE);
                break;
            case INSECTE:
                isWeakAgainst = type.equals(ACIER) || type.equals(FEU) || type.equals(POISON) || type.equals(COMBAT) || type.equals(VOL) || type.equals(SPECTRE);
                break;
            case SPECTRE:
                isWeakAgainst = type.equals(TENEBRES);
                break;
            case TENEBRES:
                isWeakAgainst = type.equals(COMBAT) || type.equals(TENEBRES) || type.equals(FEE);
                break;
            case ELECTRIQUE:
                isWeakAgainst = type.equals(PLANTE) || type.equals(ELECTRIQUE) || type.equals(DRAGON);
                break;
            default:
                isWeakAgainst = false;

        }
        return isWeakAgainst;
    }
    public boolean isImmuneTo(Types type) {
        boolean isImmuneAgainst;
        switch (this) {
            case FEE:
                isImmuneAgainst = type.equals(DRAGON);
                break;
            case VOL:
                isImmuneAgainst = type.equals(SOL);
                break;
            case ACIER:
                isImmuneAgainst = type.equals(POISON);
                break;
            case NORMAL:
                isImmuneAgainst = type.equals(SPECTRE);
                break;
            case SPECTRE:
                isImmuneAgainst = type.equals(NORMAL);
                break;
            case TENEBRES:
                isImmuneAgainst = type.equals(PSY);
                break;
            default:
                isImmuneAgainst = false;

        }
        return isImmuneAgainst;
    }
}
