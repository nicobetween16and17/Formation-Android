package exos;

public class Duree {
    int jour;
    int h;
    int min;
    int sec;

    public Duree(int sec) {
        this.sec = sec%60;
        this.min=(sec-this.sec)/60;
        this.h=(this.min-(this.min%60))/60;
        this.min=this.min%60;
        this.jour=this.h/24;
        this.h=this.h%24;
    }

    public Duree(int jour, int h, int min, int sec) {
        this.jour = jour;
        this.h = h;
        this.min = min;
        this.sec = sec;
    }

    public int getJour() {
        return jour;
    }

    public int getH() {
        return h;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    public String getDuree(){
        return this.getJour()+" jour"+this.getH()+" heure"+this.getMin()+" min"+this.getSec()+" secondes";
    }
    public int totalSecondes(){
        return this.getJour()*24*60*60+this.getH()*60*60+this.getMin()*60+this.getSec();
    }
    public void setDuree(Duree d){
        this.setJour(d.getJour());
        this.setH(d.getH());
        this.setMin(d.getMin());
        this.setSec(d.getSec());
    }
    public void SubDurée(Duree d){
        System.out.print(this.getDuree()+" - "+d.getDuree());
        Duree Dureesousstraite = new Duree(this.totalSecondes()-d.totalSecondes());
        System.out.println(Dureesousstraite);
        this.setDuree(Dureesousstraite);

    }
    public void AddDuree(Duree d){
        System.out.println(this.getDuree()+" + "+d.getDuree());
        Duree DureeAjoutee = new Duree(this.totalSecondes()+d.totalSecondes());
        System.out.println(DureeAjoutee);
        this.setDuree(DureeAjoutee);
    }
}
