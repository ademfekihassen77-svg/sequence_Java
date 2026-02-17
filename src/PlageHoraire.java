public class PlageHoraire {

    private final static int chdureeMin = 30 ;
    private Horaire chhoraireDebut ;
    private Horaire chhoraireFin ;


    public  PlageHoraire (Horaire parhoraireDebut,Horaire parhoraireFin){
        chhoraireDebut  = parhoraireDebut;
        chhoraireFin = parhoraireFin;
    }

    public String toString(){
        return "debut de la plage horriare : "+ chhoraireDebut + "et fin : "+ chhoraireFin+" et la duree minimum est "+ chdureeMin;
    }

    public boolean estValide () {
        return this.chhoraireFin.toMinute() - this.chhoraireDebut.toMinute() >= chdureeMin;
        }

    public int comparTo (PlageHoraire parPH) {
        if (this.chhoraireFin.toMinute() <= parPH.chhoraireDebut.toMinute()){
            return -10 ;
            }
        if (parPH.chhoraireDebut.toMinute() <= this.chhoraireDebut.toMinute()){
            return 1 ;
            }
        return 0 ;
    }

}

