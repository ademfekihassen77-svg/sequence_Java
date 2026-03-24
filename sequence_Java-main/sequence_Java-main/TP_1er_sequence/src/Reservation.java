public class Reservation implements Comparable <Reservation>{

    private String chtitre;
    private DateCalendrier chDate ;
    private PlageHoraire chPlageHoraire ;

    public Reservation(PlageHoraire parPlageHoraire, DateCalendrier parDate, String partitre){
        chtitre = partitre;
        chDate = parDate;
        chPlageHoraire  = parPlageHoraire;
    }
    public String toString(){
        return "votre reservation est le : "+ chDate + " et "+ chPlageHoraire.toString() +" et elle a pour titre ; "+ chtitre;
    }


    public int compareTo(Reservation parPH) {

        if (this.chDate.compareTo(parPH.chDate) != 0) {
            return this.chDate.compareTo(parPH.chDate);
        }

        return this.chPlageHoraire.comparTo(parPH.chPlageHoraire);
    }


    public Date getDate() {
        return chDate;
    }
}
